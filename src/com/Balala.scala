package com

/**
  * Created by wupeng1 on 2017/1/6.
  */
object Balala {


  def main(args: Array[String]): Unit = {
    val r = eval("4+9+9")
    println(r)
  }

  def eval(str: String): Int = str match {
    case Add(expr1, expr2) => eval(expr1) + eval(expr2)
    case _ => str.toInt
  }

}

object Add {
  val op = "+"

  //  def apply(expr1: String, expr2: String) = expr1 + "+" + expr2
  def unapply(str: String): Option[(String, String)] = {
    val index = str indexOf op
    if (index > 0)
      Some(str substring(0, index), str substring (index + 1))
    else
      None
  }
}
