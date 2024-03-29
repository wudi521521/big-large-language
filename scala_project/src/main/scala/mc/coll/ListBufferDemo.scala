package mc.coll

import scala.collection.mutable.ListBuffer

/**
 * 可变列表
 */
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    //格式1：var/ val 变量名 = List(元素1,元素2,元素3,元素4)
    val ll = ListBuffer[String]()
    ll.append("zhangsan")
    ll.append("lisi")
    println(ll)

    val ll2 = ListBuffer("zhagnsan",1,2.2)
    println(ll2)
    ll -="ss"
    //isEmpty 判断列表是否为空
    println(ll.isEmpty)
    //++ 拼接两个列表，返回一个新的列表
    println(ll++=ll)
    //head 获取列表的首个元素
    println(ll.head)
    //tail 获取列表中除首个元素之外，其他所有的元素
    println(ll.tail)
    //reverse 对列表进行反转，返回一个新的列表-------------
    println(ll.reverse)
    //take 获取列表中的前缀元素（具体格式可以自定义）
    println(ll.take(3))
    //drop（获取列表中的后缀元素）
    println("-----drop------"+ll2.drop(2))
    println("-------result--------"+ll2)
    //flatten 对列表进行扁平化操作，返回一个新的列表

    //zip 对列表进行拉链操作，即一个列表合并成一个列表-------
    println(ll.zip(ll2))
    //unzip 对列表进行拉链操作，即：将一个列表拆解成2个列表

    //toString 将列表转换成其对应的默认字符串形式
    //mkString 将列表转换成其对应的指定字符串形式
    //union 获取两个列表的并集元素，并返回一个新的列表
    //intersect 获取两个列表的交集元素，并返回一个新的列表---
    //diff 获取两个列表差集元素，并返回一个新的列表-----

  }
}
