package com.cleland.scala_learn.basic.collection

object MultiplyArray {
  def main(args: Array[String]): Unit = {
    //创建一个2 * 3的矩阵
    val arr = Array.ofDim[Int](2, 3)
    arr(0)(0) = 0
    arr(0)(1) = 1
    arr(0)(2) = 2
    arr(1)(0) = 3
    arr(1)(1) = 4
    arr(1)(2) = 5

    println(s"length: ${arr.length}")

    // 遍历
    for(i <- arr){
      for(j <- i){
        println(j)
      }
    }

    // 传统方式遍历
    println("传统方式遍历")
    for(i <- 0 until  arr.length){
      for(j <- 0 until arr(i).length){
        println(arr(i)(j))
      }
    }
  }

}
