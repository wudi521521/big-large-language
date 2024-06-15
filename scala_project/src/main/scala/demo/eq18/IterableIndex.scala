package demo.eq18

/**
 * Iterable 集合中存储的每个元素都是有索引的，如果我们按照 元素-> 索引 这种格式，生成一个新的集合，此时就需要用到zipWithIndex()方法了。
 */
object IterableIndex {
  def main(args: Array[String]): Unit = {
    //定义一个iterable 集合，存储 A 到 E 这五个字符串
    val l1 = Iterable("A", "B", "C", "D", "E")

    //通过zipWithIndex() 方法按照字符串->索引这种格式,生成新的集合
    val withIndex: Iterable[(String,Int)] = l1.zipWithIndex

    //重新按照，索引->字符串这种格式，生成新的集合
    withIndex.foreach(println(_))

    println("-"*15)
    // 打印结果
    withIndex.foreach((item=>println(item._1,item._2)));

    withIndex.map(x=>x._2->x._1)
  }

}
