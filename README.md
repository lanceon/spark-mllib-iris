Run:

```
sbt "run-main chapter01.IrisKMeans" 2> errors.out
```

Or start from sbt console:

```
run
```

Expected output:

```
[info] Set current project to spark-mllib-iris (in build file:/.../recbook/spark-mllib-iris/)
[info] Compiling 1 Scala source to ...\recbook\spark-mllib-iris\target\scala-2.11\classes...
[info] Running chapter01.IrisKMeans
Started
Loading Iris data...
Within Set Sum of Squared Errors = 78.94084142614648
[success] Total time: 15 s, completed 31 Jan. 2017 19:18:50
```
