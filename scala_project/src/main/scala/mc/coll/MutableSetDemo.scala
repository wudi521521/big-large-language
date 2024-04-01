package mc.coll

object MutableSetDemo {
  def main(args: Array[String]): Unit = {
    val set1 =Set[Int]()
    //定义一个不可变的集，保存以下元素1，1，2，3，4
    val set2 = Set(1,1,2,3,4)
    println("set1:"+set1)
    println("set2"+set2)
  }

}
