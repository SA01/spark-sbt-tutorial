package com.example.sparktutorial

import com.example.sparktutorial.Analysis.calculateAverageTipByPickupLocation

object SparkExampleMain extends App {
  val (inputPath, outputPath) = parseArgs(args = args)

  val spark = createSparkSession("Spark test", isLocal = false)
  val data = spark.read.parquet(s"${inputPath}/*.parquet")

  val analysisResult = calculateAverageTipByPickupLocation(data = data)

  analysisResult.write.option("header", "true").csv(outputPath)
}

