package com.kobekun

import scala.collection.mutable
import scala.collection.mutable._

/**
  * Created by mouse on 2018/11/29.
  */
object MapApp extends App{
//  val a = Map("zhangsan" -> 17,"wuji"->24)
//  println(a("zhangsan")+" : "+a("wuji")) //a为不可变Map
////  a("zhangsan") = 15  由于a不可变，所以不能改

  val b = Map("zhangsan" -> 17,"wuji"->24)

  b("zhangsan")=16
  b("lisi")=30
  println(b)
  println(b.get("zhangsan")) //Option[Int] = Some(16)
  println(b.get("kobekun")) //Option[Int] = None
  println(b.getOrElse("wuji",9))
  b+=("wangwu"->3,"zhaoliu"->8)
  println(b)
  b-="wangwu"
  println(b)
Option
//  for((key,value)<-b){
//    println(key+" : "+value)
//  }
//  for(key <- b.keySet){
//    println(key+ " : "+b.getOrElse(key,9))
//  }
//  for(value <- b.values){
//    println(value)
//  }

  for((key,_)<-b){
    println(key+" : "+b.getOrElse(key,9))
  }
//  println(b("lisi"))  //NoSuchElementException
  val c = mutable.HashMap[String,Int]()

}


