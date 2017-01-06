package com

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.log4j.{Level, Logger}

/**
  * Created by wupeng1 on 2017/1/6.
  */
object Balala {


  def main(args: Array[String]): Unit = {


  }

}

object Add {
  def apply(expr1: String, expr2: String) = expr1 + "+" + expr2
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split ("\\+")
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}
