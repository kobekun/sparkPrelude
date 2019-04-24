package com.kobekun

/**
  * Created by mouse on 2018/12/1.
  */
object ClassicFunctionApp extends App{

  val l = List(1,2,3,44,5,6,7,8)
  //map：逐个去操作集合中的每个元素
//  println(l.map((x:Int)=>x+1))
//  println(l.map((x)=>x*2))
//
//  //参数只有一个元素，括号可以省略
//  println(l.map(x=>x+2))
//  println(l.map(_* 2))
//
//  l.map(_*3).foreach(println)

//  l.map(_*3).filter(_>8).foreach(println)
//
//  l.take(5).foreach(println)

//  println(l.reduce(_+_))
//  println(l.reduce(_-_))
//  println(l.reduceLeft(_-_))
//  println(l.reduceRight(_-_))

  /**
    * 解析：
    * reduceLeft (((1-2)-3)-44)...
    *
    *reduceRight (1-(2-(3-(44-(5-(6-(7-8)))))))=-44
    */

//  println(l.max)
//  println(l.min)
//  println(l.sum)

//  val f = List(List(1,2,3),List(4,5),List(6,7,8,9))
//  println(f.flatten)
//  println(f.flatMap(_.map(_*2)))
//  println(f.map(_.map(_*3)))

  val fileTxt = scala.io.Source.fromFile("C:\\Users\\mouse\\Desktop\\kobekun.txt").mkString
//  println(fileTxt)
  val fileTxts = List(fileTxt)
//  fileTxts.flatMap(_+"s").foreach(println)
//  fileTxts.flatMap(_.split(",")).foreach(println)
//  fileTxts.map(_+"s").flatMap(_.split(",")).foreach(println)
   //如何使用Scala完成WordCount操作
    val mapper = fileTxts.flatMap(_.split(",")).map((_,1)).groupBy(_._1)
    println(mapper)
    val reduce = mapper.map(t=>(t._1,t._2.size)).toList.sortBy(_._2)
    println(reduce)
    val wordCount = reduce.reverse
    println(wordCount)
}
