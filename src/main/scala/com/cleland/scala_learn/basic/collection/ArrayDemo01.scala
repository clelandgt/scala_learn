package com.cleland.scala_learn.basic.collection
// 数组为定长

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    // 申明大小创建数组
    val arr01 = new Array[Int](4) // 只能为Int类型4条数据, 默认数据为0。也可申明为Any类型
    println(arr01.length)

    arr01(2) = 10
    println("输出数据")
    for(i <- arr01){
      println(i)
    }

    // 直接创建数组
    val arr02 = Array("a", "b", "c")

    println("输出数据")
    for(i <- arr02){
      println(i)
    }
  }
}
