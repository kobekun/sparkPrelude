package com.kobekun

/**
  * Created by mouse on 2018/11/28.
  */
object CaseClassApp {
  def main(args: Array[String]) {
    println(Dog("wangcai").name)
  }
}

//cass class 不用new,通常用在模式匹配中
case class Dog(name:String)