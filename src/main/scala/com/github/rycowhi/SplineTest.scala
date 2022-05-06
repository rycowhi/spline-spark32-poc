package com.github.rycowhi

import org.apache.spark.sql.SparkSession

object SplineTest {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .master("local[*]")
      .config("spark.sql.queryExecutionListeners", "za.co.absa.spline.harvester.listener.SplineQueryExecutionListener")
      .enableHiveSupport
      .getOrCreate

    spark.sql("CREATE TABLE test_table (line String)")
    spark.sql("INSERT INTO test_table values ('hi')")
  }

}
