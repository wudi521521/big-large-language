package demo.digui

object TraversableDemo1 {
  def main(args: Array[String]): Unit = {
    // mutable datasource of traversable
    val t1 = Traversable.empty[Int]
    val t2 = Traversable[Int]()
    val t3 = Nil
    println(t1.eq(t2))
    println(t2.eq(t3))
    //immutable datasource of traversable
    val tt1 = List(1,2,3).toTraversable
    val tt2 = Traversable(1,2,3)

    println(tt1.eq(tt2))
  }

}
