package demo.seq

object ClassDemo {
  def main(args: Array[String]): Unit = {
    //创建Seq集合，存储元素1，2，3，4，5
    val l1 = (1 to 5).toSeq
    //打印集合的长度
    println(l1.size + "--------" + l1.length)
    //获取索引为2的元素
    println(l1(2))
    println(l1.apply(4))
  }

}
