package mc.fcn

object SortedDemo {
  def main(args: Array[String]): Unit = {
    val l = List("01 hadoop","02 flume","03 hive")
    //x表示：List1列表中的每个元素，x.split(" ")表示的是： 通过空格切割，后面的（1）是切割后的索引值
    val l2= l.sortBy(x=>x.split(" ")(0))
    println(l2)
  }

}
