package com.cleland.scala_learn.basic.functional_programming
import io.StdIn

object FuncDemo01 {
  def main(args: Array[String]): Unit = {
    println("Enter num1")
    val num1: Int = StdIn.readInt()

    println("Enter num2")
    val num2: Int = StdIn.readInt()

    val result = sum(num1, num2)
    println(s"num1 + num2 = ${result}")
  }

  def sum(num1:Int, num2: Int): Int ={
    return num1 + num2
  }
}
