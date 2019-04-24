package com.kobekun

/**
  * Created by mouse on 2018/11/29.
  */
object ListApp extends App{
//  val l = List(1,2,3,4,5)
//  println(l.head+" : "+l.tail)
//
//  //Nil 空集合
//  val l2 = 1::Nil
//  println(l2)
//
//  val l3 = 2 :: l2
//  println(l3)
//
//  val l4 = 1 :: 2 :: 3 :: Nil
//  println(l4)
//
//  val l5 = scala.collection.mutable.ListBuffer[Int]()
//
//  l5+=2
//  l5+=(3,4,5)
//  l5++=List(6,7,8,2,9)
//
//  l5-=2
//  //有就减，没有不减
//  l5-=(1,4)
//  l5--=List(5,6,7,8)

//  println(l5)
//  println(l5.toList)
//  println(l5.toArray)

//  println(l5.isEmpty+" : "+l5.head+" : "+l5.tail+" : "+l5.tail.head)

  def sum(nums:Int*):Int={
    if(nums.length == 0){
      0
    }else{
      nums.head + sum(nums.tail:_*)
    }
  }

  println(sum())
  println(sum(1,2,3,4))
}
