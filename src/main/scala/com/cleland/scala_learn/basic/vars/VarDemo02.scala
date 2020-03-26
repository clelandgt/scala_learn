package com.cleland.scala_learn.basic.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //1. 自动推导类型推导
    var num = 10  // 这时的num就是Int

    //查看类型
    //法1, 利用idea提示看
    //法2, 使用isisInstanceOf
    println(num.isInstanceOf[Int])

    //2. 类型确定后就不能修改，会报错。说明Scala是强数据类型语言
    // num = 2.3 //报错

    //3.var修饰可变，val修改不可变
    var age = 10
    age = 20

    val num2 = 30
    //num2 = 20 //报错

    // 1. 当我们创建一个对象，里面属性的是常读写的，可以使用var，但是我们很少去修改对象本身，所以可设置为val
    // 2. val没有线程安全问题，因此效率高，scala设计者推荐我们使用val
    val dog = new Dog
    dog.age = 10

  }
}

class Dog{
  var age: Int = 0
  var name: String = "Huang Xiao"

}