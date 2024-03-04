package demo.function

/**
 *
 * Foreach：遍历集合中的元素
 */
object ForeachMain {
  def main(args: Array[String]): Unit = {
    var list = List("zhangsan","lisi","wangwu")
    list.foreach(v=>{
      println(v)
    })
  }
}
