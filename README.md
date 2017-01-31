Run:

```
sbt "run-main chapter01.IrisKMeans" 2> errors.out
```

Or start from sbt console:

```
run
```

Expected output (brief):

```
[info] Set current project to spark-mllib-iris (in build file:/.../recbook/spark-mllib-iris/)
[info] Compiling 1 Scala source to ...\recbook\spark-mllib-iris\target\scala-2.11\classes...
[info] Running chapter01.IrisKMeans
Started
Loading Iris data...
Within Set Sum of Squared Errors = 78.94084142614648
[success] Total time: 15 s, completed 31 Jan. 2017 19:18:50
```

Full output:

```
[info] Running chapter01.IrisKMeans 
Started
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
17/01/31 20:11:59 INFO SparkContext: Running Spark version 2.1.0
17/01/31 20:11:59 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
17/01/31 20:11:59 INFO SecurityManager: Changing view acls to: User
17/01/31 20:11:59 INFO SecurityManager: Changing modify acls to: User
17/01/31 20:11:59 INFO SecurityManager: Changing view acls groups to: 
17/01/31 20:11:59 INFO SecurityManager: Changing modify acls groups to: 
17/01/31 20:11:59 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(User); groups with view permissions: Set(); users  with modify permissions: Set(User); groups with modify permissions: Set()
17/01/31 20:12:00 INFO Utils: Successfully started service 'sparkDriver' on port 60640.
17/01/31 20:12:00 INFO SparkEnv: Registering MapOutputTracker
17/01/31 20:12:00 INFO SparkEnv: Registering BlockManagerMaster
17/01/31 20:12:00 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
17/01/31 20:12:00 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
17/01/31 20:12:00 INFO DiskBlockManager: Created local directory at C:\Users\User\AppData\Local\Temp\blockmgr-308ea80c-639a-48f2-95a7-7416f4feccc7
17/01/31 20:12:00 INFO MemoryStore: MemoryStore started with capacity 1643.3 MB
17/01/31 20:12:00 INFO SparkEnv: Registering OutputCommitCoordinator
17/01/31 20:12:00 INFO Utils: Successfully started service 'SparkUI' on port 4040.
17/01/31 20:12:00 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.253.102.41:4040
17/01/31 20:12:00 INFO Executor: Starting executor ID driver on host localhost
17/01/31 20:12:00 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 60649.
17/01/31 20:12:00 INFO NettyBlockTransferService: Server created on 10.253.102.41:60649
17/01/31 20:12:00 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
17/01/31 20:12:00 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.253.102.41, 60649, None)
17/01/31 20:12:00 INFO BlockManagerMasterEndpoint: Registering block manager 10.253.102.41:60649 with 1643.3 MB RAM, BlockManagerId(driver, 10.253.102.41, 60649, None)
17/01/31 20:12:00 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.253.102.41, 60649, None)
17/01/31 20:12:00 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.253.102.41, 60649, None)
Loading Iris data...
17/01/31 20:12:01 INFO SparkContext: Starting job: takeSample at KMeans.scala:353
17/01/31 20:12:01 INFO DAGScheduler: Got job 0 (takeSample at KMeans.scala:353) with 1 output partitions
17/01/31 20:12:01 INFO DAGScheduler: Final stage: ResultStage 0 (takeSample at KMeans.scala:353)
17/01/31 20:12:01 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:01 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:01 INFO DAGScheduler: Submitting ResultStage 0 (MapPartitionsRDD[5] at map at KMeans.scala:224), which has no missing parents
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_0 stored as values in memory (estimated size 2.7 KB, free 1643.2 MB)
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 1670.0 B, free 1643.2 MB)
17/01/31 20:12:01 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory on 10.253.102.41:60649 (size: 1670.0 B, free: 1643.2 MB)
17/01/31 20:12:01 INFO SparkContext: Created broadcast 0 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:01 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 0 (MapPartitionsRDD[5] at map at KMeans.scala:224)
17/01/31 20:12:01 INFO TaskSchedulerImpl: Adding task set 0.0 with 1 tasks
17/01/31 20:12:01 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0, localhost, executor driver, partition 0, PROCESS_LOCAL, 11100 bytes)
17/01/31 20:12:01 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
17/01/31 20:12:01 INFO MemoryStore: Block rdd_2_0 stored as values in memory (estimated size 10.0 KB, free 1643.2 MB)
17/01/31 20:12:01 INFO BlockManagerInfo: Added rdd_2_0 in memory on 10.253.102.41:60649 (size: 10.0 KB, free: 1643.2 MB)
17/01/31 20:12:01 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:01 INFO MemoryStore: Block rdd_3_0 stored as values in memory (estimated size 1216.0 B, free 1643.2 MB)
17/01/31 20:12:01 INFO BlockManagerInfo: Added rdd_3_0 in memory on 10.253.102.41:60649 (size: 1216.0 B, free: 1643.2 MB)
17/01/31 20:12:01 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1892 bytes result sent to driver
17/01/31 20:12:01 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 172 ms on localhost (executor driver) (1/1)
17/01/31 20:12:01 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks have all completed, from pool 
17/01/31 20:12:01 INFO DAGScheduler: ResultStage 0 (takeSample at KMeans.scala:353) finished in 0.198 s
17/01/31 20:12:01 INFO DAGScheduler: Job 0 finished: takeSample at KMeans.scala:353, took 0.405176 s
17/01/31 20:12:01 INFO SparkContext: Starting job: takeSample at KMeans.scala:353
17/01/31 20:12:01 INFO DAGScheduler: Got job 1 (takeSample at KMeans.scala:353) with 1 output partitions
17/01/31 20:12:01 INFO DAGScheduler: Final stage: ResultStage 1 (takeSample at KMeans.scala:353)
17/01/31 20:12:01 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:01 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:01 INFO DAGScheduler: Submitting ResultStage 1 (PartitionwiseSampledRDD[7] at takeSample at KMeans.scala:353), which has no missing parents
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_1 stored as values in memory (estimated size 3.5 KB, free 1643.2 MB)
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes in memory (estimated size 2.0 KB, free 1643.2 MB)
17/01/31 20:12:01 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory on 10.253.102.41:60649 (size: 2.0 KB, free: 1643.2 MB)
17/01/31 20:12:01 INFO SparkContext: Created broadcast 1 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:01 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 1 (PartitionwiseSampledRDD[7] at takeSample at KMeans.scala:353)
17/01/31 20:12:01 INFO TaskSchedulerImpl: Adding task set 1.0 with 1 tasks
17/01/31 20:12:01 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 1, localhost, executor driver, partition 0, PROCESS_LOCAL, 11209 bytes)
17/01/31 20:12:01 INFO Executor: Running task 0.0 in stage 1.0 (TID 1)
17/01/31 20:12:01 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:01 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:01 INFO Executor: Finished task 0.0 in stage 1.0 (TID 1). 2292 bytes result sent to driver
17/01/31 20:12:01 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 1) in 15 ms on localhost (executor driver) (1/1)
17/01/31 20:12:01 INFO DAGScheduler: ResultStage 1 (takeSample at KMeans.scala:353) finished in 0.017 s
17/01/31 20:12:01 INFO DAGScheduler: Job 1 finished: takeSample at KMeans.scala:353, took 0.037076 s
17/01/31 20:12:01 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks have all completed, from pool 
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_2 stored as values in memory (estimated size 152.0 B, free 1643.2 MB)
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_2_piece0 stored as bytes in memory (estimated size 353.0 B, free 1643.2 MB)
17/01/31 20:12:01 INFO BlockManagerInfo: Added broadcast_2_piece0 in memory on 10.253.102.41:60649 (size: 353.0 B, free: 1643.2 MB)
17/01/31 20:12:01 INFO SparkContext: Created broadcast 2 from broadcast at KMeans.scala:367
17/01/31 20:12:01 INFO SparkContext: Starting job: sum at KMeans.scala:373
17/01/31 20:12:01 INFO DAGScheduler: Got job 2 (sum at KMeans.scala:373) with 1 output partitions
17/01/31 20:12:01 INFO DAGScheduler: Final stage: ResultStage 2 (sum at KMeans.scala:373)
17/01/31 20:12:01 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:01 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:01 INFO DAGScheduler: Submitting ResultStage 2 (MapPartitionsRDD[9] at map at KMeans.scala:370), which has no missing parents
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_3 stored as values in memory (estimated size 4.2 KB, free 1643.2 MB)
17/01/31 20:12:01 INFO MemoryStore: Block broadcast_3_piece0 stored as bytes in memory (estimated size 2.3 KB, free 1643.2 MB)
17/01/31 20:12:01 INFO BlockManagerInfo: Added broadcast_3_piece0 in memory on 10.253.102.41:60649 (size: 2.3 KB, free: 1643.2 MB)
17/01/31 20:12:01 INFO SparkContext: Created broadcast 3 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:01 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 2 (MapPartitionsRDD[9] at map at KMeans.scala:370)
17/01/31 20:12:01 INFO TaskSchedulerImpl: Adding task set 2.0 with 1 tasks
17/01/31 20:12:01 INFO TaskSetManager: Starting task 0.0 in stage 2.0 (TID 2, localhost, executor driver, partition 0, PROCESS_LOCAL, 11126 bytes)
17/01/31 20:12:01 INFO Executor: Running task 0.0 in stage 2.0 (TID 2)
17/01/31 20:12:01 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:01 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:01 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:01 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:02 WARN BLAS: Failed to load implementation from: com.github.fommil.netlib.NativeSystemBLAS
17/01/31 20:12:02 WARN BLAS: Failed to load implementation from: com.github.fommil.netlib.NativeRefBLAS
17/01/31 20:12:02 INFO MemoryStore: Block rdd_9_0 stored as values in memory (estimated size 1216.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added rdd_9_0 in memory on 10.253.102.41:60649 (size: 1216.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO Executor: Finished task 0.0 in stage 2.0 (TID 2). 1757 bytes result sent to driver
17/01/31 20:12:02 INFO DAGScheduler: ResultStage 2 (sum at KMeans.scala:373) finished in 0.401 s
17/01/31 20:12:02 INFO DAGScheduler: Job 2 finished: sum at KMeans.scala:373, took 0.442514 s
17/01/31 20:12:02 INFO TaskSetManager: Finished task 0.0 in stage 2.0 (TID 2) in 400 ms on localhost (executor driver) (1/1)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Removed TaskSet 2.0, whose tasks have all completed, from pool 
17/01/31 20:12:02 INFO MapPartitionsRDD: Removing RDD 6 from persistence list
17/01/31 20:12:02 INFO BlockManager: Removing RDD 6
17/01/31 20:12:02 INFO BlockManagerInfo: Removed broadcast_1_piece0 on 10.253.102.41:60649 in memory (size: 2.0 KB, free: 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Removed broadcast_0_piece0 on 10.253.102.41:60649 in memory (size: 1670.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Starting job: collect at KMeans.scala:381
17/01/31 20:12:02 INFO DAGScheduler: Got job 3 (collect at KMeans.scala:381) with 1 output partitions
17/01/31 20:12:02 INFO DAGScheduler: Final stage: ResultStage 3 (collect at KMeans.scala:381)
17/01/31 20:12:02 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:02 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:02 INFO DAGScheduler: Submitting ResultStage 3 (MapPartitionsRDD[11] at mapPartitionsWithIndex at KMeans.scala:378), which has no missing parents
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_4 stored as values in memory (estimated size 4.8 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_4_piece0 stored as bytes in memory (estimated size 2.6 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_4_piece0 in memory on 10.253.102.41:60649 (size: 2.6 KB, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 4 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:02 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 3 (MapPartitionsRDD[11] at mapPartitionsWithIndex at KMeans.scala:378)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Adding task set 3.0 with 1 tasks
17/01/31 20:12:02 INFO TaskSetManager: Starting task 0.0 in stage 3.0 (TID 3, localhost, executor driver, partition 0, PROCESS_LOCAL, 11162 bytes)
17/01/31 20:12:02 INFO Executor: Running task 0.0 in stage 3.0 (TID 3)
17/01/31 20:12:02 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_9_0 locally
17/01/31 20:12:02 INFO Executor: Finished task 0.0 in stage 3.0 (TID 3). 1394 bytes result sent to driver
17/01/31 20:12:02 INFO TaskSetManager: Finished task 0.0 in stage 3.0 (TID 3) in 9 ms on localhost (executor driver) (1/1)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Removed TaskSet 3.0, whose tasks have all completed, from pool 
17/01/31 20:12:02 INFO DAGScheduler: ResultStage 3 (collect at KMeans.scala:381) finished in 0.009 s
17/01/31 20:12:02 INFO DAGScheduler: Job 3 finished: collect at KMeans.scala:381, took 0.017132 s
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_5 stored as values in memory (estimated size 432.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_5_piece0 stored as bytes in memory (estimated size 490.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_5_piece0 in memory on 10.253.102.41:60649 (size: 490.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 5 from broadcast at KMeans.scala:367
17/01/31 20:12:02 INFO SparkContext: Starting job: sum at KMeans.scala:373
17/01/31 20:12:02 INFO DAGScheduler: Got job 4 (sum at KMeans.scala:373) with 1 output partitions
17/01/31 20:12:02 INFO DAGScheduler: Final stage: ResultStage 4 (sum at KMeans.scala:373)
17/01/31 20:12:02 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:02 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:02 INFO DAGScheduler: Submitting ResultStage 4 (MapPartitionsRDD[13] at map at KMeans.scala:370), which has no missing parents
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_6 stored as values in memory (estimated size 4.4 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_6_piece0 stored as bytes in memory (estimated size 2.4 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_6_piece0 in memory on 10.253.102.41:60649 (size: 2.4 KB, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 6 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:02 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 4 (MapPartitionsRDD[13] at map at KMeans.scala:370)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Adding task set 4.0 with 1 tasks
17/01/31 20:12:02 INFO TaskSetManager: Starting task 0.0 in stage 4.0 (TID 4, localhost, executor driver, partition 0, PROCESS_LOCAL, 11158 bytes)
17/01/31 20:12:02 INFO Executor: Running task 0.0 in stage 4.0 (TID 4)
17/01/31 20:12:02 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_9_0 locally
17/01/31 20:12:02 INFO MemoryStore: Block rdd_13_0 stored as values in memory (estimated size 1216.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added rdd_13_0 in memory on 10.253.102.41:60649 (size: 1216.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO Executor: Finished task 0.0 in stage 4.0 (TID 4). 1757 bytes result sent to driver
17/01/31 20:12:02 INFO TaskSetManager: Finished task 0.0 in stage 4.0 (TID 4) in 17 ms on localhost (executor driver) (1/1)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Removed TaskSet 4.0, whose tasks have all completed, from pool 
17/01/31 20:12:02 INFO DAGScheduler: ResultStage 4 (sum at KMeans.scala:373) finished in 0.019 s
17/01/31 20:12:02 INFO DAGScheduler: Job 4 finished: sum at KMeans.scala:373, took 0.025726 s
17/01/31 20:12:02 INFO MapPartitionsRDD: Removing RDD 9 from persistence list
17/01/31 20:12:02 INFO BlockManager: Removing RDD 9
17/01/31 20:12:02 INFO SparkContext: Starting job: collect at KMeans.scala:381
17/01/31 20:12:02 INFO DAGScheduler: Got job 5 (collect at KMeans.scala:381) with 1 output partitions
17/01/31 20:12:02 INFO DAGScheduler: Final stage: ResultStage 5 (collect at KMeans.scala:381)
17/01/31 20:12:02 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:02 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:02 INFO DAGScheduler: Submitting ResultStage 5 (MapPartitionsRDD[15] at mapPartitionsWithIndex at KMeans.scala:378), which has no missing parents
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_7 stored as values in memory (estimated size 5.1 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_7_piece0 stored as bytes in memory (estimated size 2.7 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_7_piece0 in memory on 10.253.102.41:60649 (size: 2.7 KB, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 7 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:02 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 5 (MapPartitionsRDD[15] at mapPartitionsWithIndex at KMeans.scala:378)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Adding task set 5.0 with 1 tasks
17/01/31 20:12:02 INFO TaskSetManager: Starting task 0.0 in stage 5.0 (TID 5, localhost, executor driver, partition 0, PROCESS_LOCAL, 11194 bytes)
17/01/31 20:12:02 INFO Executor: Running task 0.0 in stage 5.0 (TID 5)
17/01/31 20:12:02 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_13_0 locally
17/01/31 20:12:02 INFO Executor: Finished task 0.0 in stage 5.0 (TID 5). 1298 bytes result sent to driver
17/01/31 20:12:02 INFO TaskSetManager: Finished task 0.0 in stage 5.0 (TID 5) in 5 ms on localhost (executor driver) (1/1)
17/01/31 20:12:02 INFO DAGScheduler: ResultStage 5 (collect at KMeans.scala:381) finished in 0.006 s
17/01/31 20:12:02 INFO TaskSchedulerImpl: Removed TaskSet 5.0, whose tasks have all completed, from pool 
17/01/31 20:12:02 INFO DAGScheduler: Job 5 finished: collect at KMeans.scala:381, took 0.016270 s
17/01/31 20:12:02 INFO MapPartitionsRDD: Removing RDD 13 from persistence list
17/01/31 20:12:02 INFO BlockManager: Removing RDD 13
17/01/31 20:12:02 INFO TorrentBroadcast: Destroying Broadcast(2) (from destroy at KMeans.scala:388)
17/01/31 20:12:02 INFO TorrentBroadcast: Destroying Broadcast(5) (from destroy at KMeans.scala:388)
17/01/31 20:12:02 INFO BlockManagerInfo: Removed broadcast_2_piece0 on 10.253.102.41:60649 in memory (size: 353.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Removed broadcast_5_piece0 on 10.253.102.41:60649 in memory (size: 490.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_8 stored as values in memory (estimated size 616.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_8_piece0 stored as bytes in memory (estimated size 593.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_8_piece0 in memory on 10.253.102.41:60649 (size: 593.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 8 from broadcast at KMeans.scala:398
17/01/31 20:12:02 INFO SparkContext: Starting job: countByValue at KMeans.scala:399
17/01/31 20:12:02 INFO DAGScheduler: Registering RDD 18 (countByValue at KMeans.scala:399)
17/01/31 20:12:02 INFO DAGScheduler: Got job 6 (countByValue at KMeans.scala:399) with 1 output partitions
17/01/31 20:12:02 INFO DAGScheduler: Final stage: ResultStage 7 (countByValue at KMeans.scala:399)
17/01/31 20:12:02 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 6)
17/01/31 20:12:02 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 6)
17/01/31 20:12:02 INFO DAGScheduler: Submitting ShuffleMapStage 6 (MapPartitionsRDD[18] at countByValue at KMeans.scala:399), which has no missing parents
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_9 stored as values in memory (estimated size 5.4 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_9_piece0 stored as bytes in memory (estimated size 3.0 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_9_piece0 in memory on 10.253.102.41:60649 (size: 3.0 KB, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 9 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:02 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 6 (MapPartitionsRDD[18] at countByValue at KMeans.scala:399)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Adding task set 6.0 with 1 tasks
17/01/31 20:12:02 INFO TaskSetManager: Starting task 0.0 in stage 6.0 (TID 6, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:02 INFO Executor: Running task 0.0 in stage 6.0 (TID 6)
17/01/31 20:12:02 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:02 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:02 INFO Executor: Finished task 0.0 in stage 6.0 (TID 6). 1655 bytes result sent to driver
17/01/31 20:12:02 INFO TaskSetManager: Finished task 0.0 in stage 6.0 (TID 6) in 72 ms on localhost (executor driver) (1/1)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Removed TaskSet 6.0, whose tasks have all completed, from pool 
17/01/31 20:12:02 INFO DAGScheduler: ShuffleMapStage 6 (countByValue at KMeans.scala:399) finished in 0.073 s
17/01/31 20:12:02 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:02 INFO DAGScheduler: running: Set()
17/01/31 20:12:02 INFO DAGScheduler: waiting: Set(ResultStage 7)
17/01/31 20:12:02 INFO DAGScheduler: failed: Set()
17/01/31 20:12:02 INFO DAGScheduler: Submitting ResultStage 7 (ShuffledRDD[19] at countByValue at KMeans.scala:399), which has no missing parents
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_10 stored as values in memory (estimated size 3.2 KB, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_10_piece0 stored as bytes in memory (estimated size 1979.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_10_piece0 in memory on 10.253.102.41:60649 (size: 1979.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 10 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:02 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 7 (ShuffledRDD[19] at countByValue at KMeans.scala:399)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Adding task set 7.0 with 1 tasks
17/01/31 20:12:02 INFO TaskSetManager: Starting task 0.0 in stage 7.0 (TID 7, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:02 INFO Executor: Running task 0.0 in stage 7.0 (TID 7)
17/01/31 20:12:02 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:02 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 7 ms
17/01/31 20:12:02 INFO Executor: Finished task 0.0 in stage 7.0 (TID 7). 1974 bytes result sent to driver
17/01/31 20:12:02 INFO TaskSetManager: Finished task 0.0 in stage 7.0 (TID 7) in 62 ms on localhost (executor driver) (1/1)
17/01/31 20:12:02 INFO TaskSchedulerImpl: Removed TaskSet 7.0, whose tasks have all completed, from pool 
17/01/31 20:12:02 INFO DAGScheduler: ResultStage 7 (countByValue at KMeans.scala:399) finished in 0.063 s
17/01/31 20:12:02 INFO DAGScheduler: Job 6 finished: countByValue at KMeans.scala:399, took 0.408743 s
17/01/31 20:12:02 INFO TorrentBroadcast: Destroying Broadcast(8) (from destroy at KMeans.scala:401)
17/01/31 20:12:02 INFO BlockManagerInfo: Removed broadcast_8_piece0 on 10.253.102.41:60649 in memory (size: 593.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO LocalKMeans: Local KMeans++ converged in 2 iterations.
17/01/31 20:12:02 INFO KMeans: Initialization with k-means|| took 1.588 seconds.
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_11 stored as values in memory (estimated size 320.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO MemoryStore: Block broadcast_11_piece0 stored as bytes in memory (estimated size 386.0 B, free 1643.2 MB)
17/01/31 20:12:02 INFO BlockManagerInfo: Added broadcast_11_piece0 in memory on 10.253.102.41:60649 (size: 386.0 B, free: 1643.2 MB)
17/01/31 20:12:02 INFO SparkContext: Created broadcast 11 from broadcast at KMeans.scala:273
17/01/31 20:12:03 INFO SparkContext: Starting job: collectAsMap at KMeans.scala:295
17/01/31 20:12:03 INFO DAGScheduler: Registering RDD 20 (mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO DAGScheduler: Got job 7 (collectAsMap at KMeans.scala:295) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 9 (collectAsMap at KMeans.scala:295)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 8)
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 8)
17/01/31 20:12:03 INFO DAGScheduler: Submitting ShuffleMapStage 8 (MapPartitionsRDD[20] at mapPartitions at KMeans.scala:276), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_12 stored as values in memory (estimated size 5.0 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_12_piece0 stored as bytes in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_12_piece0 in memory on 10.253.102.41:60649 (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 12 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 8 (MapPartitionsRDD[20] at mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 8.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 8.0 (TID 8, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 8.0 (TID 8)
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 8.0 (TID 8). 1708 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 8.0 (TID 8) in 28 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 8.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ShuffleMapStage 8 (mapPartitions at KMeans.scala:276) finished in 0.029 s
17/01/31 20:12:03 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:03 INFO DAGScheduler: running: Set()
17/01/31 20:12:03 INFO DAGScheduler: waiting: Set(ResultStage 9)
17/01/31 20:12:03 INFO DAGScheduler: failed: Set()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 9 (ShuffledRDD[21] at reduceByKey at KMeans.scala:292), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_13 stored as values in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_13_piece0 stored as bytes in memory (estimated size 1653.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_13_piece0 in memory on 10.253.102.41:60649 (size: 1653.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 13 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 9 (ShuffledRDD[21] at reduceByKey at KMeans.scala:292)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 9.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 9.0 (TID 9, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 9.0 (TID 9)
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 0 ms
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 9.0 (TID 9). 2046 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 9.0 (TID 9) in 7 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 9.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 9 (collectAsMap at KMeans.scala:295) finished in 0.009 s
17/01/31 20:12:03 INFO DAGScheduler: Job 7 finished: collectAsMap at KMeans.scala:295, took 0.068920 s
17/01/31 20:12:03 INFO TorrentBroadcast: Destroying Broadcast(11) (from destroy at KMeans.scala:297)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_11_piece0 on 10.253.102.41:60649 in memory (size: 386.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_14 stored as values in memory (estimated size 320.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_14_piece0 stored as bytes in memory (estimated size 395.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_14_piece0 in memory on 10.253.102.41:60649 (size: 395.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 14 from broadcast at KMeans.scala:273
17/01/31 20:12:03 INFO SparkContext: Starting job: collectAsMap at KMeans.scala:295
17/01/31 20:12:03 INFO DAGScheduler: Registering RDD 22 (mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO DAGScheduler: Got job 8 (collectAsMap at KMeans.scala:295) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 11 (collectAsMap at KMeans.scala:295)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 10)
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 10)
17/01/31 20:12:03 INFO DAGScheduler: Submitting ShuffleMapStage 10 (MapPartitionsRDD[22] at mapPartitions at KMeans.scala:276), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_15 stored as values in memory (estimated size 5.0 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_15_piece0 stored as bytes in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_15_piece0 in memory on 10.253.102.41:60649 (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 15 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 10 (MapPartitionsRDD[22] at mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 10.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 10.0 (TID 10, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 10.0 (TID 10)
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 10.0 (TID 10). 1708 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 10.0 (TID 10) in 20 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 10.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ShuffleMapStage 10 (mapPartitions at KMeans.scala:276) finished in 0.021 s
17/01/31 20:12:03 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:03 INFO DAGScheduler: running: Set()
17/01/31 20:12:03 INFO DAGScheduler: waiting: Set(ResultStage 11)
17/01/31 20:12:03 INFO DAGScheduler: failed: Set()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 11 (ShuffledRDD[23] at reduceByKey at KMeans.scala:292), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_16 stored as values in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_16_piece0 stored as bytes in memory (estimated size 1658.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_16_piece0 in memory on 10.253.102.41:60649 (size: 1658.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 16 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 11 (ShuffledRDD[23] at reduceByKey at KMeans.scala:292)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 11.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 11.0 (TID 11, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 11.0 (TID 11)
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 1 ms
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 11.0 (TID 11). 2046 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 11.0 (TID 11) in 9 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 11.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 11 (collectAsMap at KMeans.scala:295) finished in 0.011 s
17/01/31 20:12:03 INFO DAGScheduler: Job 8 finished: collectAsMap at KMeans.scala:295, took 0.052456 s
17/01/31 20:12:03 INFO TorrentBroadcast: Destroying Broadcast(14) (from destroy at KMeans.scala:297)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_17 stored as values in memory (estimated size 320.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_17_piece0 stored as bytes in memory (estimated size 397.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_17_piece0 in memory on 10.253.102.41:60649 (size: 397.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_14_piece0 on 10.253.102.41:60649 in memory (size: 395.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 17 from broadcast at KMeans.scala:273
17/01/31 20:12:03 INFO SparkContext: Starting job: collectAsMap at KMeans.scala:295
17/01/31 20:12:03 INFO DAGScheduler: Registering RDD 24 (mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO DAGScheduler: Got job 9 (collectAsMap at KMeans.scala:295) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 13 (collectAsMap at KMeans.scala:295)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 12)
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 12)
17/01/31 20:12:03 INFO DAGScheduler: Submitting ShuffleMapStage 12 (MapPartitionsRDD[24] at mapPartitions at KMeans.scala:276), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_18 stored as values in memory (estimated size 5.0 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_18_piece0 stored as bytes in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_18_piece0 in memory on 10.253.102.41:60649 (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 18 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 12 (MapPartitionsRDD[24] at mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 12.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 12.0 (TID 12, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 12.0 (TID 12)
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 12.0 (TID 12). 1629 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 12.0 (TID 12) in 46 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 12.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ShuffleMapStage 12 (mapPartitions at KMeans.scala:276) finished in 0.046 s
17/01/31 20:12:03 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:03 INFO DAGScheduler: running: Set()
17/01/31 20:12:03 INFO DAGScheduler: waiting: Set(ResultStage 13)
17/01/31 20:12:03 INFO DAGScheduler: failed: Set()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 13 (ShuffledRDD[25] at reduceByKey at KMeans.scala:292), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_19 stored as values in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_19_piece0 stored as bytes in memory (estimated size 1658.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_19_piece0 in memory on 10.253.102.41:60649 (size: 1658.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 19 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 13 (ShuffledRDD[25] at reduceByKey at KMeans.scala:292)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 13.0 with 1 tasks
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_16_piece0 on 10.253.102.41:60649 in memory (size: 1658.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 13.0 (TID 13, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 13.0 (TID 13)
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 0 ms
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 13.0 (TID 13). 2046 bytes result sent to driver
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_15_piece0 on 10.253.102.41:60649 in memory (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 13.0 (TID 13) in 13 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 13.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 13 (collectAsMap at KMeans.scala:295) finished in 0.014 s
17/01/31 20:12:03 INFO DAGScheduler: Job 9 finished: collectAsMap at KMeans.scala:295, took 0.125483 s
17/01/31 20:12:03 INFO TorrentBroadcast: Destroying Broadcast(17) (from destroy at KMeans.scala:297)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_20 stored as values in memory (estimated size 320.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_20_piece0 stored as bytes in memory (estimated size 395.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_20_piece0 in memory on 10.253.102.41:60649 (size: 395.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_17_piece0 on 10.253.102.41:60649 in memory (size: 397.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 20 from broadcast at KMeans.scala:273
17/01/31 20:12:03 INFO SparkContext: Starting job: collectAsMap at KMeans.scala:295
17/01/31 20:12:03 INFO DAGScheduler: Registering RDD 26 (mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO DAGScheduler: Got job 10 (collectAsMap at KMeans.scala:295) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 15 (collectAsMap at KMeans.scala:295)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 14)
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 14)
17/01/31 20:12:03 INFO DAGScheduler: Submitting ShuffleMapStage 14 (MapPartitionsRDD[26] at mapPartitions at KMeans.scala:276), which has no missing parents
17/01/31 20:12:03 INFO ContextCleaner: Cleaned shuffle 2
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_21 stored as values in memory (estimated size 5.0 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_21_piece0 stored as bytes in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_21_piece0 in memory on 10.253.102.41:60649 (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 21 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 14 (MapPartitionsRDD[26] at mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 14.0 with 1 tasks
17/01/31 20:12:03 INFO ContextCleaner: Cleaned accumulator 481
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 14.0 (TID 14, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_13_piece0 on 10.253.102.41:60649 in memory (size: 1653.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 14.0 (TID 14)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_12_piece0 on 10.253.102.41:60649 in memory (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO ContextCleaner: Cleaned shuffle 1
17/01/31 20:12:03 INFO ContextCleaner: Cleaned accumulator 384
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_10_piece0 on 10.253.102.41:60649 in memory (size: 1979.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_9_piece0 on 10.253.102.41:60649 in memory (size: 3.0 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO ContextCleaner: Cleaned shuffle 0
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_7_piece0 on 10.253.102.41:60649 in memory (size: 2.7 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 14.0 (TID 14). 1629 bytes result sent to driver
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_6_piece0 on 10.253.102.41:60649 in memory (size: 2.4 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 14.0 (TID 14) in 9 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 14.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ShuffleMapStage 14 (mapPartitions at KMeans.scala:276) finished in 0.009 s
17/01/31 20:12:03 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:03 INFO DAGScheduler: running: Set()
17/01/31 20:12:03 INFO DAGScheduler: waiting: Set(ResultStage 15)
17/01/31 20:12:03 INFO DAGScheduler: failed: Set()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 15 (ShuffledRDD[27] at reduceByKey at KMeans.scala:292), which has no missing parents
17/01/31 20:12:03 INFO BlockManager: Removing RDD 13
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_22 stored as values in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO ContextCleaner: Cleaned RDD 13
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_22_piece0 stored as bytes in memory (estimated size 1658.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_22_piece0 in memory on 10.253.102.41:60649 (size: 1658.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 22 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 15 (ShuffledRDD[27] at reduceByKey at KMeans.scala:292)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 15.0 with 1 tasks
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_4_piece0 on 10.253.102.41:60649 in memory (size: 2.6 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 15.0 (TID 15, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_3_piece0 on 10.253.102.41:60649 in memory (size: 2.3 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 15.0 (TID 15)
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 0 ms
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 15.0 (TID 15). 1959 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 15.0 (TID 15) in 4 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 15.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 15 (collectAsMap at KMeans.scala:295) finished in 0.005 s
17/01/31 20:12:03 INFO DAGScheduler: Job 10 finished: collectAsMap at KMeans.scala:295, took 0.027354 s
17/01/31 20:12:03 INFO TorrentBroadcast: Destroying Broadcast(20) (from destroy at KMeans.scala:297)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_23 stored as values in memory (estimated size 320.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_20_piece0 on 10.253.102.41:60649 in memory (size: 395.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_23_piece0 stored as bytes in memory (estimated size 401.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_23_piece0 in memory on 10.253.102.41:60649 (size: 401.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 23 from broadcast at KMeans.scala:273
17/01/31 20:12:03 INFO SparkContext: Starting job: collectAsMap at KMeans.scala:295
17/01/31 20:12:03 INFO DAGScheduler: Registering RDD 28 (mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO DAGScheduler: Got job 11 (collectAsMap at KMeans.scala:295) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 17 (collectAsMap at KMeans.scala:295)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 16)
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 16)
17/01/31 20:12:03 INFO DAGScheduler: Submitting ShuffleMapStage 16 (MapPartitionsRDD[28] at mapPartitions at KMeans.scala:276), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_24 stored as values in memory (estimated size 5.0 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_24_piece0 stored as bytes in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_24_piece0 in memory on 10.253.102.41:60649 (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 24 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 16 (MapPartitionsRDD[28] at mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 16.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 16.0 (TID 16, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 16.0 (TID 16)
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 16.0 (TID 16). 1708 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 16.0 (TID 16) in 8 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 16.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ShuffleMapStage 16 (mapPartitions at KMeans.scala:276) finished in 0.009 s
17/01/31 20:12:03 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:03 INFO DAGScheduler: running: Set()
17/01/31 20:12:03 INFO DAGScheduler: waiting: Set(ResultStage 17)
17/01/31 20:12:03 INFO DAGScheduler: failed: Set()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 17 (ShuffledRDD[29] at reduceByKey at KMeans.scala:292), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_25 stored as values in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_25_piece0 stored as bytes in memory (estimated size 1655.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_25_piece0 in memory on 10.253.102.41:60649 (size: 1655.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 25 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 17 (ShuffledRDD[29] at reduceByKey at KMeans.scala:292)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 17.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 17.0 (TID 17, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 17.0 (TID 17)
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 0 ms
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 17.0 (TID 17). 2046 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 17.0 (TID 17) in 4 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 17.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 17 (collectAsMap at KMeans.scala:295) finished in 0.004 s
17/01/31 20:12:03 INFO DAGScheduler: Job 11 finished: collectAsMap at KMeans.scala:295, took 0.019770 s
17/01/31 20:12:03 INFO TorrentBroadcast: Destroying Broadcast(23) (from destroy at KMeans.scala:297)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_26 stored as values in memory (estimated size 320.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_23_piece0 on 10.253.102.41:60649 in memory (size: 401.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_26_piece0 stored as bytes in memory (estimated size 399.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_26_piece0 in memory on 10.253.102.41:60649 (size: 399.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 26 from broadcast at KMeans.scala:273
17/01/31 20:12:03 INFO SparkContext: Starting job: collectAsMap at KMeans.scala:295
17/01/31 20:12:03 INFO DAGScheduler: Registering RDD 30 (mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO DAGScheduler: Got job 12 (collectAsMap at KMeans.scala:295) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 19 (collectAsMap at KMeans.scala:295)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 18)
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 18)
17/01/31 20:12:03 INFO DAGScheduler: Submitting ShuffleMapStage 18 (MapPartitionsRDD[30] at mapPartitions at KMeans.scala:276), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_27 stored as values in memory (estimated size 5.0 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_27_piece0 stored as bytes in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_27_piece0 in memory on 10.253.102.41:60649 (size: 2.8 KB, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 27 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 18 (MapPartitionsRDD[30] at mapPartitions at KMeans.scala:276)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 18.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 18.0 (TID 18, localhost, executor driver, partition 0, PROCESS_LOCAL, 11092 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 18.0 (TID 18)
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO BlockManager: Found block rdd_3_0 locally
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 18.0 (TID 18). 1708 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 18.0 (TID 18) in 6 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 18.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ShuffleMapStage 18 (mapPartitions at KMeans.scala:276) finished in 0.006 s
17/01/31 20:12:03 INFO DAGScheduler: looking for newly runnable stages
17/01/31 20:12:03 INFO DAGScheduler: running: Set()
17/01/31 20:12:03 INFO DAGScheduler: waiting: Set(ResultStage 19)
17/01/31 20:12:03 INFO DAGScheduler: failed: Set()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 19 (ShuffledRDD[31] at reduceByKey at KMeans.scala:292), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_28 stored as values in memory (estimated size 2.8 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_28_piece0 stored as bytes in memory (estimated size 1658.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_28_piece0 in memory on 10.253.102.41:60649 (size: 1658.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 28 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 19 (ShuffledRDD[31] at reduceByKey at KMeans.scala:292)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 19.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 19.0 (TID 19, localhost, executor driver, partition 0, ANY, 5756 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 19.0 (TID 19)
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/01/31 20:12:03 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 0 ms
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 19.0 (TID 19). 2046 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 19.0 (TID 19) in 4 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 19.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 19 (collectAsMap at KMeans.scala:295) finished in 0.004 s
17/01/31 20:12:03 INFO DAGScheduler: Job 12 finished: collectAsMap at KMeans.scala:295, took 0.018597 s
17/01/31 20:12:03 INFO TorrentBroadcast: Destroying Broadcast(26) (from destroy at KMeans.scala:297)
17/01/31 20:12:03 INFO BlockManagerInfo: Removed broadcast_26_piece0 on 10.253.102.41:60649 in memory (size: 399.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO KMeans: Iterations took 0.902 seconds.
17/01/31 20:12:03 INFO KMeans: KMeans converged in 6 iterations.
17/01/31 20:12:03 INFO KMeans: The cost is 78.94084142614648.
17/01/31 20:12:03 INFO MapPartitionsRDD: Removing RDD 3 from persistence list
17/01/31 20:12:03 INFO BlockManager: Removing RDD 3
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_29 stored as values in memory (estimated size 344.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_29_piece0 stored as bytes in memory (estimated size 492.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_29_piece0 in memory on 10.253.102.41:60649 (size: 492.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 29 from broadcast at KMeansModel.scala:86
17/01/31 20:12:03 INFO SparkContext: Starting job: sum at KMeansModel.scala:87
17/01/31 20:12:03 INFO DAGScheduler: Got job 13 (sum at KMeansModel.scala:87) with 1 output partitions
17/01/31 20:12:03 INFO DAGScheduler: Final stage: ResultStage 20 (sum at KMeansModel.scala:87)
17/01/31 20:12:03 INFO DAGScheduler: Parents of final stage: List()
17/01/31 20:12:03 INFO DAGScheduler: Missing parents: List()
17/01/31 20:12:03 INFO DAGScheduler: Submitting ResultStage 20 (MapPartitionsRDD[32] at map at KMeansModel.scala:87), which has no missing parents
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_30 stored as values in memory (estimated size 3.2 KB, free 1643.2 MB)
17/01/31 20:12:03 INFO MemoryStore: Block broadcast_30_piece0 stored as bytes in memory (estimated size 1959.0 B, free 1643.2 MB)
17/01/31 20:12:03 INFO BlockManagerInfo: Added broadcast_30_piece0 in memory on 10.253.102.41:60649 (size: 1959.0 B, free: 1643.2 MB)
17/01/31 20:12:03 INFO SparkContext: Created broadcast 30 from broadcast at DAGScheduler.scala:996
17/01/31 20:12:03 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 20 (MapPartitionsRDD[32] at map at KMeansModel.scala:87)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Adding task set 20.0 with 1 tasks
17/01/31 20:12:03 INFO TaskSetManager: Starting task 0.0 in stage 20.0 (TID 20, localhost, executor driver, partition 0, PROCESS_LOCAL, 10803 bytes)
17/01/31 20:12:03 INFO Executor: Running task 0.0 in stage 20.0 (TID 20)
17/01/31 20:12:03 INFO BlockManager: Found block rdd_2_0 locally
17/01/31 20:12:03 INFO Executor: Finished task 0.0 in stage 20.0 (TID 20). 956 bytes result sent to driver
17/01/31 20:12:03 INFO TaskSetManager: Finished task 0.0 in stage 20.0 (TID 20) in 4 ms on localhost (executor driver) (1/1)
17/01/31 20:12:03 INFO TaskSchedulerImpl: Removed TaskSet 20.0, whose tasks have all completed, from pool 
17/01/31 20:12:03 INFO DAGScheduler: ResultStage 20 (sum at KMeansModel.scala:87) finished in 0.004 s
17/01/31 20:12:03 INFO DAGScheduler: Job 13 finished: sum at KMeansModel.scala:87, took 0.007881 s
Within Set Sum of Squared Errors = 78.94084142614648
17/01/31 20:12:03 INFO SparkUI: Stopped Spark web UI at http://10.253.102.41:4040
17/01/31 20:12:03 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
17/01/31 20:12:03 INFO MemoryStore: MemoryStore cleared
17/01/31 20:12:03 INFO BlockManager: BlockManager stopped
17/01/31 20:12:03 INFO BlockManagerMaster: BlockManagerMaster stopped
17/01/31 20:12:03 INFO OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
17/01/31 20:12:03 INFO SparkContext: Successfully stopped SparkContext
[success] Total time: 5 s, completed Jan 31, 2017 8:12:03 PM
```
