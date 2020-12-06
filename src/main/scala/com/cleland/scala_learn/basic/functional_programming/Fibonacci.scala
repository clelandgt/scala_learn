package com.cleland.scala_learn.basic.functional_programming

// 斐波拉切数列: 1,1,2,3,5,8,13...

object Fibonacci {

  def main(args: Array[String]): Unit = {
    val start = 0
    val end = 10

    for(i <- start to end){
      print(s"${fibonacci(i)} ")
    }
  }

  def fibonacci(n: Int): Int = {
    if(n <= 1){
      return n
    }

    return fibonacci(n-1) + fibonacci(n-2)
  }
}
