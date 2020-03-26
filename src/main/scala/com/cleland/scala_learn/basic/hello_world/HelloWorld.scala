package com.cleland.scala_learn.basic.hello_world

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello, scala")

    // **** print, println, printf之间的区别 ******
    println("**** print, println, printf之间的区别 ******")
    print("My name is: ")
    print("Ming Xiao ")


    println("\nMy name is: ")
    println("Ming Xiao ")

    val name1 = "Ming Xiao"
    printf("My name is $name1")

    // **** 输出额三种方式 ******
    println("\n\n**** 输出的三种方式 ******")
    // 1. 使用+
    val name: String="tom"
    val sal: Double=1.2
    println("hello" + sal + name)

    // 2. printf格式化
    printf("name=%s sal=%f\n", name, sal)

    // 3.使用$引用方式
    println(s"name=$name sal=$sal+1")
  }
}
