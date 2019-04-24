package com.kobekun

/**
  * Created by mouse on 2018/11/23.
  */
object FunctionApp {
  def main(args: Array[String]) {
//    println(add(3,4))
//    println(three())
//    println(three)  //没有入参的函数，调用时括号是可以省略的
//
//    saySomething()
//    saySomething
//
//    sayName()   //括号不能去掉
//    sayName("baby")
//      println(speed(100,10))
//      println(speed(distance = 100,time = 10))
//      println(speed(time = 10,distance = 300))


//    println(sum(1,2,7))
//    println(sum(1,2,7,8))
//    println(sum(1,2,7,5,9))
//    println(1 to 10)
//    println(1.to(10))
//    println(1to 10)  //to前后必须有空格
//    println(Range(1,10))

//    println(Range(1,10,3))
//    println(Range(1,10,0)) //步长不能为0
//    println(1 until 10)

//    for (i <- 1 to 10 if i%2==0){
//      println(i)
//    }
//    val courses = Array("Hadoop","Spark SQL","Spark Streaming","Scala")
//    for(course<-courses){
//      println(course)
//    }
//    courses.foreach(x=>println(x))

    var (num,sum) = (100,0)
    while (num > 0){  //出口
      sum = sum + num
      num = num - 1  //步长
    }
    println(sum)
  }

  def add(x:Int,y:Int):Int = {
    x+y
  }

  def three()=1+2

  def saySomething(): Unit ={
    println("sayHello")
  }
  def sayName(a:String="kobekun"): Unit ={
    println(a)
  }

  def  speed(distance:Float,time:Float):Float={
    distance/time
  }

  //可变参数
  def sum(numbers:Int*)={
    var result = 0;
    for (number<-numbers){
      result += number
    }

    result
  }
}
