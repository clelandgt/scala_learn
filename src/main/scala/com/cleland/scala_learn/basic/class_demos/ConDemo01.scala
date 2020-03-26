package com.cleland.scala_learn.basic.class_demos

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val person = new Person("Huang Xiao", 20)
    println(person.toString)
  }

}

class Person{
  var name: String = _
  var age: Int = _

  def this(name: String, age: Int){
    this()
    this.age = age
    this.name = name
  }

  override def toString: String = {
    s"name=${this.name} age=${this.age}"
  }
}

