package mc.coll

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple1 = ("zhangsan",11)
    val tuple2 = "lisi"->12
    println(tuple1)
    println(tuple2)
    println(tuple2._2)
    val it= tuple1.productIterator
    for (i <- it)println(i)
  }

}
