package chapter01

import org.apache.spark.mllib.clustering.KMeans
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source

/**
  * Created by AZ on 31.01.2017
  */
object IrisKMeans {

  def getResourceFile(filePath: String) = {
    val is = getClass.getResourceAsStream(filePath)
    Source.fromInputStream(is).getLines()
  }

  def main(args: Array[String]): Unit = {
    println("Started")

    val appName = "IrisKMeans"
    val master = "local" // or "local[2]"
    val conf = new SparkConf()
      .setAppName(appName)
      .setMaster(master)
    val sc = new SparkContext(conf)

    println("Loading Iris data...")
    val dataFilePath = "/iris.data.txt"
    val src = getResourceFile(dataFilePath).filter(_.nonEmpty).toList
    val textData = sc.parallelize(src)
    val parsedData = textData
      .map(_.split(",").dropRight(1).map(_.toDouble))
      .map(Vectors.dense)
      .cache()

    val numClusters = 3
    val numIterations = 20
    val clusters = KMeans.train(parsedData, numClusters, numIterations)

    val WSSSE = clusters.computeCost(parsedData)
    println(s"Within Set Sum of Squared Errors = $WSSSE")

    sc.stop()
  }

}
