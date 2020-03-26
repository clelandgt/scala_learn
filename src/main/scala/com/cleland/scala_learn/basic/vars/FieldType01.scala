package com.cleland.scala_learn.basic.vars

object FieldType01 {
  var name = "hello"
  var age = 100
  def main(args: Array[String]): Unit = {

    // 整型
    println(s"Byte: ${Byte.MinValue} ~ ${Byte.MaxValue}")
    println(s"Short: ${Short.MinValue} ~ ${Short.MaxValue}")
    println(s"Int: ${Int.MinValue} ~ ${Int.MaxValue}")
    println(s"Long: ${Long.MinValue} ~ ${Long.MaxValue}")

    var i = 10 //Int
    var j = 10l //Long
    println(s"i is Int: ${i.isInstanceOf[Int]}")
    println(s"j is Int: ${j.isInstanceOf[Int]}")
    println(s"j is Long: ${j.isInstanceOf[Long]}")

    // 浮点
    var num1 = 2.2345678912
    var num2 = 2.2345678912f
    var num3: Float = 2.2345678912f
    // var num4: Float = 2.2345678912 没有f, 会报错
    var num4: Double = 2.2345678912

    // 字符
    // 指定数字对应的字符(码值表 unicode)
    var char1: Char = 97
    println(s"\nchar1: ${char1}")

    // 值类型隐式转换
    var n1 = 10
    var n2 = 1.1f
    var n3 = n1 + n2
    println(s"\nn3=${n3}")
    println(s"n3=${n3.isInstanceOf[Float]}")

    //强制类型转换
    var num11: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    var num12: Int = (10 * 3.5 + 6 * 1.5).toInt
    println(s"\nnum11=${num11}  num12=${num12}")

  }
}
