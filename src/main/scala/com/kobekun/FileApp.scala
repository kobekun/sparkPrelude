package com.kobekun

import scala.io.Source

/**
  * Created by mouse on 2018/12/4.
  */
object FileApp {
  def main(args: Array[String]) {
    val file = Source.fromFile("C:\\Users\\mouse\\Desktop\\kobekun.txt")(scala.io.Codec.ISO8859)
    def readLine: Unit ={
      for (line <- file.getLines())
        println(line)
    }

//    readLine

    def readChar: Unit ={
      for(ele <- file){
        println(ele)
      }
    }
//    readChar
    def readNet: Unit ={
      val file = Source.fromURL("https://www.baidu.com")
      for (line <- file.getLines()){
          println(line)
      }
    }
    readNet
  }
}
