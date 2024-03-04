package demo.function

/**
 * flatten:flat即压缩，扁平化，效果就是将集合中的每个元素子元素映射到某个函数并返回新的集合
 */
object FlattenMain {
  def main(args: Array[String]): Unit = {
    var list = List(List(1,2,3),List(3,4,5))
    val list2 = list.flatten
    println(list2)
  }

}
