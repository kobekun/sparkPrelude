package com.kobekun

import java.io.File
import ImplicitAspect._

//隐式转换主要的作用，是进行方法增强，比如一个类里面没有A方法，但是还想调用这个方法，
//这时声明个隐式转换函数，将普通类转换成含有A方法的类。
/**
  * Created by mouse on 2018/12/1.
  */
object ImplicitApp extends App{
  //定义隐式转换函数
  val man = new Man("kobekun")
  man.eat()
  man.fly()
//
//  val file = new File("C:\\Users\\mouse\\Desktop\\kobekun.txt")
//
//  val txt = file.read()
//  println(txt)
  //作用在object或伴生对象
//  implicit val test = "test"
//
//  def main(args: Array[String]) {
//    def testParam(implicit name:String): Unit ={
//      println(name+"$$$$$$$$$$$$$")
//    }
//    //在实际调用中不需要显示传入这个参数，但是在作用域范围内必须声明一个String类型的隐式变量，
//    // 这样在调用的时候，会自动传入这个变量。PS：如果在同一个作用域内定义了两个同类型的隐式变量，则会有冲突。
//    testParam
//  }

//  testParam("zhangsan")
//  implicit val name = "impplicit_name"
//  testParam
//  testParam("PK")

  //Error:(29, 3) ambiguous implicit values:
//  both value s1 in object ImplicitApp of type => String
//  and value s2 in object ImplicitApp of type => String
//  match expected type String
//  testParam

//  implicit val s1="s1"
//  implicit val s2="s2"
//  testParam

}

class Man(val name:String){
  def eat(): Unit ={
    println(s"man $name eat...")
  }
}
class SuperMan(val name:String){
  def fly(): Unit ={
    println(s"Superman $name fly...")
  }
}
class RichFile(val file:File){
  def read()={
    scala.io.Source.fromFile(file.getPath).mkString
  }
}

//scala> import scala.language.implicitConversions
//import scala.language.implicitConversions
//
//scala> implicit def int2Range(num : Int): Range = 1 to num
//int2Range: (num: Int)Range
//
//scala> def spreadNum(range: Range): String = range.mkString(",")
//spreadNum: (range: Range)String
//
//scala> spreadNum(5)
//res0: String = 1,2,3,4,5

//上面所示，spreadNum函数签名是个Range类型的参数，但是传入的值是一个Int类型的，
//所以编译器在作用域内找到了int2Range隐式转换函数，自动将int转换为range对象来适配。
//隐式转换的函数叫什么名字无所谓，因为实际调用中不会手动调用，
//但是如果需要使用隐式转换函数，需要import方式手动导入，才能被编译器寻找到。


//scala> class Man(name: String)
//defined class Man
//
//scala> implicit class MyImplicitTypeConversion(val man: Man) {
//  |     def fly = println("you can fly")
//  |   }
//defined class MyImplicitTypeConversion
//
//scala> val cyony = new Man("cyony")
//cyony: Man = Man@7412a438
//
//scala> cyony.fly
//you can fly


//隐式参数：作用域内需要声明隐式变量，调用的时候不需要传入参数
//类型匹配  ：一个隐式转换函数中的参数，会匹配普通方法的参数，如果能匹配上，
// 在调用的时候，直接调用普通函数
//类型增强：在调用类里面的方法时，发现没有这个方法，但是通过隐式类声明该方法可以
//实现普通类调用隐式类的方法