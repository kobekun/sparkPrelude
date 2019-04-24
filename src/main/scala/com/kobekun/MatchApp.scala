package com.kobekun

import scala.util.Random

/**
  * Created by mouse on 2018/11/30.
  */
object MatchApp extends App{
  val names = Array("Yoshizawa","YuiHatano","Sola")

  val name = names(Random.nextInt(names.length))

//  name match {
//    case "Yoshizawa"=>println("吉老师。。。")
//    case "YuiHatano"=>println("波老师")
//    case _ => println("不清楚")
//  }
//
//  def judgeGrade(grade:String): Unit ={
//    grade match {
//      case "A"=>println("excelent...")
//      case "B"=>println("Good...")
//      case "C"=>println("Just so so..")
//      case _  =>println("you need work harder...")
//    }
//  }
//
//  judgeGrade("A")
//  judgeGrade("C")
//  judgeGrade("D")

//  def judgeGrade(name:String,grade:String): Unit ={
//    grade match {
//      case "A"=>println("excelent...")
//      case "B"=>println("Good...")
//      case "C"=>println("Just so so..")
//      case _ if(name == "lisi") =>println(name+" you're a good boy,but...")
//      case _  =>println("you need work harder...")
//    }
//  }
//  judgeGrade("zhangsan","A")
//  judgeGrade("lisi","B")
//  judgeGrade("lisi","D")//双重过滤

//  def greeting(array:Array[String]): Unit ={
//    array match {
//      case Array("zhangsan")=>println("hi:zhangsan")
//      case Array(x,y)=>println("hi, "+x+" , "+y)
//      case Array("zhangsan",_*)=>println("hi,zhangsan and other friends...")
//      case _=>println("hi,everybody")
//    }
//  }
//  greeting(Array("zhangsan"))
//  greeting(Array("lisi","guojing"))
//  greeting(Array("zhangsan","kobekun","rondo"))
//  greeting(Array("sanches","pogba","muller"))

//  def greeting(list:List[String]): Unit ={
//    list match {
//      case "zhangsan"::Nil =>println("hi,zhangsan")
//      case x::y::Nil=>println("hi,"+x+" ,"+y)
//      case "zhangsan"::tail=>println("hi,zhangsan and other friends..")
//      case _=>println("hi,everybody")
//    }
//  }
//
//  greeting(List("zhangsan"))
//  greeting(List("zhangsan","lisi")) //走case2,先匹配上
//  greeting(List("kobekun","james"))
//  greeting(List("zhangsan","lisi","kobekun"))
//  greeting(List("zhangwang","zhaowu","niuliu"))

//  def matchType(obj:Any): Unit ={
//    obj match {
//      case x:Int=>println("Int")
//      case s:String=>println("String")
//      case m:Map[_,_]=>m.foreach(println)
//      case _=>println("other type")
//    }
//  }
//
//  matchType(1)
//  matchType("kobekun")
//  matchType(1f)
//  matchType(Map("name"->"PK"))
//  matchType(Map("name"->"PK","kobekun"->"excelent"))

//  class Person
//  case class CTO(name:String,floor:String) extends Person
//  case class Employee(name:String,floor:String) extends Person
//  case class Others(name:String) extends Person
//
//  def caseClassMatch(person: Person): Unit ={
//    person match {
//      case CTO(name,floor)=>println("CTO name is: "+name+", floor is "+floor)
//      case Employee(name,floor)=>println("Employee name is : "+name+", floor is "+floor)
//      case _ =>println("other")
//    }
//  }
//
//  caseClassMatch(CTO("PK","22"))
//  caseClassMatch(Employee("zhangsi","3"))
//  caseClassMatch(Others("qingliang"))

  var grades = Map("PK"->"A","lisi"->"C")
  def getGrade(name:String): Unit ={
    val grade = grades.get(name)
    grade match {
      case Some(grade)=>println(name+" your grade is "+grade)
      case None=>println("sorry...")
    }
  }

  getGrade("zhangsan")
  getGrade("lisi")
  getGrade("PK")
}
