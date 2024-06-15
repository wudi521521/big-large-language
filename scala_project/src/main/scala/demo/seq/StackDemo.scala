package demo.seq

import scala.collection.mutable

object StackDemo {
  def main(args: Array[String]): Unit = {
    //定义stack
    val ss = mutable.Stack(1 ,2,3,4,5)
    //top 获取栈顶数据
    println(ss.top)
    //push 添加数据
    println(ss.push(6))
    println(ss.pushAll(Seq(1,23)))

  }
}
