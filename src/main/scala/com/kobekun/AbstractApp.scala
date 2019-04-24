package com.kobekun

/**
  * Created by mouse on 2018/11/28.
  */
object AbstractApp {
  def main(args: Array[String]) {
    val student2 = new Student2()
    println(student2.name)
    student2.speak()
  }
}

/**
  * 类的一个或多个方法只有定义没有完整的实现
  */
abstract class Person2{
  def speak

  val name:String
  val age:Int
}

class Student2 extends Person2{
  override def speak(): Unit ={
    println("abstract method speak implement")
  }
  override val name:String = "kobekun"

  override val age:Int = 10

}