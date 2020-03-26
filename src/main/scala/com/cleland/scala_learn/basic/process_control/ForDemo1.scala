package com.cleland.scala_learn.basic.process_control

object ForDemo1 {
  def main(args: Array[String]): Unit = {

    // for 循环
    val start = 1
    val end = 5

    // 前后都闭合
    println("\n前后都闭合 to")
    for(i <- start to end){

      println("Hi")
    }
    // 前闭后开
    println("\n前闭后开 until")
    for(i <- start until end){
      println("Hi")
    }


    // 使用for推导，直接对集合进行遍历
    println("\nfor推导遍历集合")
    val l = List("a", "b", "c")
    for (item <- l){
      println(s"item = ${item}")
    }

    // 循环守卫
    println("\n循环守卫")
    for(i <- 1 to 3 if i != 2){
      println(s"i = $i")
    }

    // 引入变量
    println("\n引入变量")
    for(i <- 1 to 5; j = 2 * i){
      println(s"j = $j")
    }
  }
}
