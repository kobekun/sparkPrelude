//package com.kobekun
//
//import java.sql._
//
///**
//  * Created by mouse on 2018/12/4.
//  */
//object MysqlApp {
//  def main(args: Array[String]){
//    val url = "jdbc:mysql://localhost:3306/mysql"
//    val username = "root"
//    val password = "881105"
//    var connection:Connection = null
//    var statement:Statement = null
//    var resultSet:ResultSet = null
//    try{
//      //make the connection
//      classOf[com.mysql.jdbc.Driver]
//      connection = DriverManager.getConnection(url,username,password)
//      statement = connection.createStatement()
//      resultSet = statement.executeQuery("select host,user from user")
//      while(resultSet.next()){
//        val host = resultSet.getString("host")
//        val user = resultSet.getString("user")
//
//        println(s"${host}....${user}")
//      }
//    }catch {
//      case e:SQLException => println("sqlException")
//      case e:Exception => e.printStackTrace()
//    }finally {
////      if(connection == null)connection.close()
////      if(statement == null)statement.close()
////      if(resultSet == null)resultSet.close()
//    }
//  }
//
//}
