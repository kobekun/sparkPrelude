package com.kobekun

/**
  * Created by mouse on 2018/11/30.
  */
object StringApp extends App{
//  val s = "Hello:"
  val name = "PK"
  val team = "AC Milan"
//  println(s+name)
  //差值
  println(s"Hello:$name,Welcome to $team")

  val b =
    """
      |这是一个多行字符串
      |Hello
      |World
      |PK
    """.stripMargin

  println(b)
}
