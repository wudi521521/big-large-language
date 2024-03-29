package mc.coll

/**
 * //flatten 对列表进行扁平化操作，返回一个新的列表
 */
object FlatternDemo {
  def main(args: Array[String]): Unit = {
    val list = List(List(1,2),List(1,2,3),List(3,4,5))
    val list2 = list.flatten
    println(list2)
  }

}
