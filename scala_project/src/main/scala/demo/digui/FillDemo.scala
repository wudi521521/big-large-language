package demo.digui

import scala.util.Random

object FillDemo {
  def main(args: Array[String]): Unit = {
    //通过fill生成集合
    println(Traversable.fill(5)("传志博客"))

    //获取随机数
    println(Traversable.fill(3)(Random.nextInt(111)))

    //获取数组中数组
    println(Traversable.fill(5,2)("hello world"))
  }

}
