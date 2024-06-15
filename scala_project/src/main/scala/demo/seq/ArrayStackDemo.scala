package demo.seq

import scala.collection.mutable

object ArrayStackDemo {
  def main(args: Array[String]): Unit = {
    //定义可变栈
    val l = mutable.ArrayStack(1,2,3,4)
    println(l.toString())
    //通过dup（）方法复制栈顶元素，并打印结果
    l.dup()
    println(l)
    //通过preseving（）方法实现先清空集合元素，然后恢复集合中清理掉的元素

    println(l.toString())
   println("------执行preserve-----"+l.preserving(l.clear()))
    println(l)

  }

}
