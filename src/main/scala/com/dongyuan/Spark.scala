package com.dongyuan

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * @Project_Name Spark
  * @Package_Name com.dongyuan
  * @Create_Time 2020/3/11 21:46
  */
object Spark {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Spark").setMaster("local[*]")
    SparkSession.
  }
}
