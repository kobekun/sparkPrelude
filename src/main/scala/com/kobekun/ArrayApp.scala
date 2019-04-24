package com.kobekun

/**
  * Created by mouse on 2018/11/29.
  */
object ArrayApp extends App{
//  val a = new Array[String](5)
//
//  a(1) = "hello"
//  println(a.length)
//  println(a(1))
//  val b = Array("Haddop","Spark","Storm")
//  println(b(1))
//  b(1) = "Flink"
//  println(b.toString)
//  println(b(3))  //ArrayIndexOutOfBoundsException

  //把数组转换成字符串用mkString
  val ctr = Array(2,3,4,5,6,7,8)
//  println(c.max + " : " + c.min + " : " + c.sum)
//  println(c.mkString)
//  println(c.mkString(","))
//  println(c.mkString("<",",",">"))

  val c = scala.collection.mutable.ArrayBuffer[Int]()

  c+=1
  c+=2
  c+=(3,4,5)
  c++=Array(6,7,8)

  c.insert(1,0)
  c.remove(0)
  c.remove(3,3)
  c.trimEnd(2)


//  println(c)
//  println(c.toArray.mkString)

//  for (i <- 0 until c.length){
//    println(c(i))
//  }

//  for(ele <- c){
//    println(ele)
//  }

    for (i <- (0 until c.length).reverse){
      println(c(i))
    }
}
