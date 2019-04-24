package com.kobekun

/**
  * Created by mouse on 2018/11/30.
  * 匿名函数：(参数名称:参数类型。。。)=>函数体
  */
object NimingFunctionApp extends App{
//  val f1 = (x:Int)=>x+1
//  println(f1(10))
//
//  def add = (x:Int,y:Int)=>{x+y}
//  println(add(3,4))

  //原来接受两个参数的函数，颗粒化转换成分开的参数
  def sum(x:Int,y:Int)=x+y
  println(sum(2,4))

  def sum2(x:Int)(y:Int)=x+y
  println(sum2(2)(3))
}
