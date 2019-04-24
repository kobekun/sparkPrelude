package com.kobekun

/**
  * Created by mouse on 2018/11/22.
  */
import scala.io.Source._
object ScalaLazy {
  def main(args: Array[String]) {
    lazy val a = 1 //a:Int = <lazy>
    println(a)  //第一次使用的时候才会加载值

    lazy val info =  fromFile("E:\\IdeaProjects\\bigdatafromscala\\src\\main\\scala\\com\\kobekun\\TestScala.scala").mkString
    println(info)
  }
}
