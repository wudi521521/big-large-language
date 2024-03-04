package demo.function

/**
 * reduce：对集合中的元素进行归约操作
 */
object ReduceMain {
  def main(args: Array[String]): Unit = {
    var list = List(1,2,6,8)
    val i: Int =list.reduce((v1,v2)=>v1*v2)
    println(i)
  }

}
