package com.kobekun

import scala.util.Random

/**
  * Created by mouse on 2018/12/1.
  */
object PartitionApp extends App{
  val names = Array("Yoshizawa","YuiHatano","Sola")

  val name = names(Random.nextInt(names.length))

    name match {
      case "Yoshizawa"=>println("吉老师。。。")
      case "YuiHatano"=>println("波老师")
      case _ => println("不清楚")
    }
  //偏函数，被包含在花括号内，没有match做匹配的case语句
  //PartialFunction后面的参数是入参类型，出参类型
  def sayChinese:PartialFunction[String,String]={
    case "Yoshizawa"=>"吉老师。。。"
    case "YuiHatano"=>"波老师"
    case _ => "不清楚"
  }

  println(sayChinese("Yoshizawa"))
}
