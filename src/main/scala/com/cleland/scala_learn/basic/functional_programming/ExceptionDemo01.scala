package com.cleland.scala_learn.basic.functional_programming

object ExceptionDemo01 {
  def main(args: Array[String]): Unit = {
    try{
      val num = 10 / 0
    }catch {
      case ex: ArithmeticException=>{
        println("捕获了除数为0的异常")
      }
      case ex: Exception=>println("捕获了异常")
    }finally {
      //最终要执行的代码
      println("scala finally....")
    }

    println("ok, 继续运行")
  }
}
