package com.kobekun

import java.io.File

/**
  * Created by mouse on 2018/12/1.
  */
object ImplicitAspect {
  implicit def file2RichFile(file:File):RichFile=new RichFile(file)
  implicit def man2superman(man: Man):SuperMan = new SuperMan(man.name)
}
