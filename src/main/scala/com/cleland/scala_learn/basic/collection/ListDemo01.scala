package com.cleland.scala_learn.basic.collection

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    val list01 = List(1, 2, 3,  "a", "b", "c", "hello")
    println(list01)
    println(list01(2))

    // 创建空集合
    val list02 = Nil
    println(list02)


    // 增加数据，运算规则: 从右向左
    // 法1：
    val list03 = list01 :+ 7
    println(s"往后追加7: ${list03}")
    val list04 = 10 +: list01
    println(s"往前追加7: ${list04}")

    // 法2:
    // :: 运算符表示向集合中 新建集合添加元素。
    val list5 = List(1, 2, 3, "abc")
    val list6 = 4 :: 5 :: 6 :: list5 :: Nil
    println(s"${list6}")

    // ::: 运算符是将集合中的每一个元素加入到集合中去
    val list7 = 4 :: 5 :: 6 :: list5 ::: Nil
    println(s"${list7}")
  }
}
