package mc.fcn

object SortedWithDemo {
  def main(args: Array[String]): Unit = {
    val l = (1 to 9).toList
    //方式1：降序
    val l2 = l.sortWith((x,y)=>x>y)
    println(l2)
    //方式2：降序
    val l3 = l.sortWith(_>_)
    println(l3)
  }

}
