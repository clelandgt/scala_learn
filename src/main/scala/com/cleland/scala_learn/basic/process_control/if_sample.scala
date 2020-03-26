package com.cleland.scala_learn.basic.process_control
import io.StdIn

/*
出票系统: 根据淡旺季的月份和年龄，打印出票价

旺季(4-10月份)：
  儿童(<18): 30
  成人(18-60): 60
  老人(>60): 20

淡季:
  成人: 40
  其他: 20
 */

object if_sample {
  def main(args: Array[String]): Unit = {

    println("输入月份:")
    val month: Int = StdIn.readInt()

    println("输入年龄:")
    val age: Int = StdIn.readInt()

    if(month >= 4 && month <= 10){
      if(age < 18){
        println("旺季 儿童 票价为: 30")
      }else if(age >= 18 && age <= 60){
        println("旺季 成人 票价为: 60")
      }else{
        println("旺季 老人 票价为: 20")
      }
    }else{
      if(age >= 18 && age <= 60){
        println("淡季 成人 票价为: 40")
      }else{
        println("淡季 其他 票价为: 20")
      }

    }
  }
}
