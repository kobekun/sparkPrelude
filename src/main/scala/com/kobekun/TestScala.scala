package com.kobekun

/**
  * Created by mouse on 2018/11/22.
  */
object TestScala {
  def main(args: Array[String]) {
    val a:Float = 1.2f
    val c = 1.4f
    val b = 1.3
    val d = 10
    val e = d.asInstanceOf[Double]
    val f = d.isInstanceOf[Int]
    val g = d.isInstanceOf[Double]
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println("Hello,scala")
  }
}
