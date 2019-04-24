package com.kobekun

/**
  * Created by mouse on 2018/11/28.
  */
object ApplyApp {
  def main(args: Array[String]) {
//    for (i <- 1 to 10){
//      ApplyTest.insc()
//    }
//    println(ApplyTest.count)  //说明object本身就是个单例对象
    val b = ApplyTest()  // ==>调用object.apply()

    println("---------------------")
    val c = new ApplyTest()
    println(c)
    c()

    //类名()==>Object.apply
    //对象()==>Class.apply
  }
}

/**
  * 伴生类和伴生对象
  * 如果有一个class 和一个object同名，那么称这个class为object的伴生类，object为这个class的伴生对象
  */
class ApplyTest{
  def apply()={
    println("class ApplyTest enter...")
  }
}
object ApplyTest{
  var count:Int = 0
  println("obeject ApplyTest enter...")
  def insc()={
    count = count + 1
  }

  //通常做法  最佳实践 在object的apply中new Class
  def apply():ApplyTest={
    println("obeject ApplyTest apply...")
    //在object的apply中new了一个class
    new ApplyTest()
  }
  println("obeject ApplyTest leave...")
}