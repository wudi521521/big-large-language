package demo.digui

object IterableDemo2 {
  def main(args: Array[String]): Unit = {
    //定义一个列表，存储1，2，3，4，5这5个数字
    val list = (1 to 50).toList
    //通过iterator()方法遍历上述的列表
    val it: Iterator[Int] = list.toIterator
    //按照5个数据一组进行分组
    val ll = it.grouped(5)


    while (ll.hasNext){
      println(ll.next())
      println("========")
    }

  }

}
