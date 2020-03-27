package com.cleland.scala_learn.basic.collection

object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    val t1 = (1, 'a', 'b', 2)

    // 下标从1开始
    println(t1._1)

    // 下标从0开始
    println(t1.productElement(0))

    // 元组的遍历
    println("元组的遍历")
    for(i <- t1.productIterator){
      println(i)
    }
  }
}
