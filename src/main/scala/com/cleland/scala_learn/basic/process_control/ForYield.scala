package com.cleland.scala_learn.basic.process_control

object ForYield {
  def main(args: Array[String]): Unit = {
    // 打印 1 ~ 100之间的偶数
    val start = 1
    val end = 100

    val res = for (i <- start to end) yield {
      if (i % 2 == 0) {
        i
      } else {

      }
    }
    println(res)

    // 打印 1 ~ 100
    val res2 = for (i <- start to end) yield i
    println(res2)
  }
}
