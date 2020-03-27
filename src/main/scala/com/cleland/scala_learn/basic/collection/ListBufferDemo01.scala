package com.cleland.scala_learn.basic.collection
import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val lsb = ListBuffer[Int](1,2,3)

    // 下标访问
    println(lsb(1))

    // 遍历
    println("遍历")
    for(item <- lsb){
      println(item)
    }

    // 新增数据


  }
}
