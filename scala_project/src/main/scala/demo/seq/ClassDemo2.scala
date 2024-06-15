package demo.seq

object ClassDemo2 {
  def main(args: Array[String]): Unit = {
    //定义
    val l1 = Seq(1, 2, 3, 3, 4, 5, 6, 2)
    //获取元素2在集合中第一次出现的索引，并打印
    println(l1.indexOf(2))
    //获取元素2在集合中最后一次出现的的索引，并打印
    println(l1.lastIndexOf(2))

    println("-" * 15)
    //获取集合中，小于5的第一个偶数的索引，并打印
    println(l1.indexWhere(x => x < 5 && x % 2 == 0))
    //获取集合中，小于5的最后一个偶数的索引，从索引2开找并打印
    println(l1.indexWhere(x => x < 5 && x % 2 == 0),2)

    //获取集合中，小于5的最后一个偶数的索引，并打印
    println(l1.lastIndexWhere(x => x < 5 && x % 2 == 0))

    //获取子序列Seq(1,2)在S1集合中，第一次出现的索引，并打印
    println(l1.indexOfSlice(Seq(1,2)))
    //从索引3开始查找子序列Seq（1，2）在s1集合中，第一次出现的索引，并打印
    println(l1.indexOfSlice(Seq(1,2),3))
  }

}
