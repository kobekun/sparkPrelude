package com.kobekun

/**
  * Created by mouse on 2018/11/27.
  */
object ConstutorApp {
  def main(args: Array[String]) {

//    val person = new Person("张三",20)
//    println(person.name + ":" + person.age)
//
//    val person1 = new Person("kobekun",28,"M")
//    println(person1.name + ":" + person1.age + ":" + person1.gender)
  }
//    val student = new Student("xiangbian",29,"Math")
//  println(student.name + ":" + student.major)
  val student = new Student("PK",25,"English")
  println(student)
}
//主构造器
class Person(val name:String,val age:Int){
  println("name enter...")

  val school = "kobekun"
  var gender:String = _
  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender = gender
  }
  println("name leave...")
}

class Student(name:String,age:Int,var major:String) extends Person(name,age){
  println("Person student enter...")
  override val school = "Peking"
  override def toString():String = "Student: override def toString " + school;

  println("Person student leave...")
}