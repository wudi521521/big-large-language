package demo.digui

object IterableDemo {
  def main(args: Array[String]): Unit = {
    //定义一个列表，存储1，2，3，4，5这5个数字
    val list = (1 to 5).toList
    //通过iterator()方法遍历上述的列表
    val it: Iterator[Int] = list.toIterator
    //通过集合对象(list)来获取其对应的迭代器对象
    while (it.hasNext){
      println(it.next())
    }
    list.foreach(println(_))
    //
  }

}
