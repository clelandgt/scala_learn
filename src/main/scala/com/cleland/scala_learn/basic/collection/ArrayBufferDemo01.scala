package com.cleland.scala_learn.basic.collection

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {

    // 1. 变长数组
    // 初始化数据1,4,7
    val arr01 = ArrayBuffer[Any](1,4,7)

    for(i <- arr01){
      println(i)
    }
    println(s"arro1 hashcode: ${arr01.hashCode()}")
    println(s"arro1 length: ${arr01.length}")
    println(s"访问第2个元素: ${arr01(1)}")


    arr01.append(20, 50)
    println(s"arro1 hashcode: ${arr01.hashCode()}")
    println(s"arro1 length: ${arr01.length}")
    for(i <- arr01){
      println(i)
    }
    //由此可见: 每 append 一次，arr 在底层会重新分配空间，进行扩容，arr2 的内存地址会发生变化，也就成 为新的 ArrayBuffer

    // 2. 变长与定长之间的转化
    // arr1.toBuffer  定长数组转可变数组, 本身没有变化
    // arr1.toArray  可变数组转定长数组, 本身没有变化
    println(s"hashcode: ${arr01.toArray.hashCode()}")
    println(s"hashcode: ${arr01.toArray.toBuffer.hashCode()}")

  }

}
