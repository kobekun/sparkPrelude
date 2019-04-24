package com.kobekun

/**
  * Created by mouse on 2018/11/30.
  */
object ExceptionApp extends App{

  try {
    val i=10/0
    println(i)
  }catch {
    case e:ArithmeticException=>println("除数不能为0..")
    case e:Exception=>println(e.getMessage)
  }finally {
    //释放资源，肯定执行
  }
}
