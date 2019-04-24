package com.kobekun

/**
  * Created by mouse on 2018/11/29.
  * Tuple 元组
  */
object TupleApp extends App{
  val a = (1,2,3,4,6)
//  println(a)
//  println(a._1) //下标从1开始
  for(i<- 0 until(a.productArity)){
    println(a.productElement(i))
  }

  val hostPort = ("localhost",8080)
  println(hostPort._1)
  println(hostPort._2)
}
