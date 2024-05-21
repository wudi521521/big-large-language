package demo.digui

object IterableDemo3 {
  def main(args: Array[String]): Unit = {
    val l = Iterable("A","B","C","D","C")
    val l4 = Iterable("A","B","C","D","C")
    //通过zipWithIndex()方法按照字符串->索引这种格式
     val l2:Iterable[(String,Int)] = l.zipWithIndex //结果List((A,0), (B,1), (C,2), (D,3), (C,4))
    //重新按照，索引->字符串这种格式，生成新的集合
     val l3 = l2.map(x=>x._2->x._1) //结果：List((0,A), (1,B), (2,C), (3,D), (4,C))
    //打印结果
    println(l2)
    println(l3)
    //如果为true需要满足条件：element of same ,sort index of same
    println(l.sameElements(l4))
  }

}
