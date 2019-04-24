package com.kobekun

import java.io.{InputStreamReader, FileInputStream}

import scala.xml.XML

/**
  * Created by mouse on 2018/12/6.
  */
object XMLApp {
  def main(args: Array[String]) {
    loadXML()
  }
//  为什么加载xml资源时，用fileinputstream和inputstreamreader都可以读出xml的内容，
//  用getResource就抛出空指针异常，颇有不解


  def loadXML(): Unit ={
//    val xml = XML.load(this.getClass.getClassLoader.getResource("kobekun.xml"))
//    println(xml)
//    val xml = XML.load(new FileInputStream("E:\\IdeaProjects\\bigdatafromscala\\src\\main\\resource\\kobekun.xml"))
//    println(xml)
    val xml = XML.load(
      new InputStreamReader(
        new FileInputStream("E:\\IdeaProjects\\bigdatafromscala\\src\\main\\resource\\kobekun.xml")
      )
    )
    println(xml)
  }
}
