package com.cleland.scala_learn.basic.functional_programming

object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(30, 40)
    println("--------")
    println(s"result = ${res}")
  }


  def sum(n1: Int, n2: Int): Int = {
    println("执行了")
    return n1 + n2
  }
}
