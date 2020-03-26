package com.cleland.scala_learn.basic.class_demos

object Extends01 {
  def main(args: Array[String]): Unit = {
    val stu = new Student("Hua Xiao", 15)
    stu.studying()

  }
}

class Person(name1: String, age1: Int){
  val name: String = name1
  val age: Int = age1

  def showInfo(): Unit = {
    println("学生信息如下")
    println(s"名字: ${this.name}   年龄: ${this.age}")
  }

//  def this(name: String, age: Int){
//    this(name, age)
//  }

}

class Student(name1: String, age1: Int) extends Person(name1: String, age1: Int) {
  def studying(): Unit = {
    println(s"${this.name} 学习中....")
  }

}