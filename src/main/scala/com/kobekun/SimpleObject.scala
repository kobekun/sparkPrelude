package com.kobekun

/**
  * Created by mouse on 2018/11/26.
  */
object SimpleObject {
  def main(args: Array[String]) {
    val person = new People();
    person.name = "Muller"
    println(person.name+".."+person.age)

    println("invoke eat method "+person.eat())
    person.watchFootball("Barcelona")
    person.printInfo()

//    println(person.gender)  private修饰的编译不通过
  }
}

class People{
  var name:String = _ //用占位符必须加上类型
  // var name =_
  val age = 10

  private [this] val gender = "male"

  def printInfo(): Unit ={
    println("gender:"+gender)
  }

  def eat(): String ={
    name +" eat"
  }
  def watchFootball(teamName:String): Unit ={
    println(name+" is watching match of "+teamName)
  }
}
