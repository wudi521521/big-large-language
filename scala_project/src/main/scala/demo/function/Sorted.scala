package demo.function

/**
 * sorted:对集合中的元素进行排序
 */
object Sorted {
  def main(args: Array[String]): Unit = {
    var list = List(1,13,4,24)
    println(list.sorted)
    println(list.sorted.reverse)
  }

}
