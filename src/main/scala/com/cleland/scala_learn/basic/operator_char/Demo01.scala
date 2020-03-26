package com.cleland.scala_learn.basic.operator_char

import io.StdIn


/* 需求: 可以从控制台接受用户的信息[用户依次输入：姓名， 年龄，薪水]
 参考标准输入API: https://www.scala-lang.org/api/current/scala/io/StdIn$.html

*/


object Demo01 {
  def main(args: Array[String]): Unit = {
    // 读取一整行
    println("请输入姓名:")
    val name: String = StdIn.readLine()

    // 读取输入额整型
    println("请输入年龄:")
    val age: Int = StdIn.readInt()

    // 读取输入的薪水
    println("请输入薪水:")
    val sal: Double = StdIn.readDouble()

    println(s"姓名=${name} 年龄=${age} 薪水=${sal}")
  }
}
