package com.kobekun

/**
  * Created by mouse on 2018/12/2.
  */
object ImplicitClassApp extends App{
  implicit class calculator(x:Int){
    def add(a:Int)=a+x
  }
  println(1.add(4))
}
