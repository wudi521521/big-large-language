package demo.digui

object TraversableDemo3 {
  def main(args: Array[String]): Unit = {
    val t1 = Traversable(11,22,33)
    val t2 = Traversable(44,55,66)
    val t3 = Traversable(77,88,99)
    val t4= Traversable.concat(t1,t2,t3)
    println(t4)
  }

}
