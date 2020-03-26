package com.cleland.scala_learn.basic.class_demos

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小黄"
    cat.age = 5
    cat.color = "red"

    println(s"小猫的属性: ${cat.name} ${cat.age} ${cat.color}")

  }
}


class Cat{
  var name: String = _ //分配默认值
  var age: Int = _
  var color: String = _
}