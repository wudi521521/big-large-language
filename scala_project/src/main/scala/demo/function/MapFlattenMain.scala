package demo.function

object MapFlattenMain {
  def main(args: Array[String]): Unit = {
    var list = List("zhangsan lisi","lisi wangwu","wangwu wangwu")
    println(list.flatMap(v=>v.split(" ")))
  }

}
