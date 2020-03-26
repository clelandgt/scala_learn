package com.cleland.scala_learn.basic.functional_programming

// 斐波拉切数列: 1,1,2,3,5,8,13...

object Fibonacci {

  def main(args: Array[String]): Unit = {
    println(fibonacci(6))

  }

  def fibonacci(n: Int): Int = {
    if(n == 0){
      return 1
    }
    if(n == 1){
      return 1
    }

    return fibonacci(n-1) + fibonacci(n-2)
  }
}
