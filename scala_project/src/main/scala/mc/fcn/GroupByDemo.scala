package mc.fcn

object GroupByDemo {
  def main(args: Array[String]): Unit = {
    val l1 = List("liu"->"男","lx"->"女","hg"->"男")
    //格式1：
    val l2 = l1.groupBy(x=>x._2)
    println(l2)
    //格式2：
    val l3 = l1.groupBy(_._2)
    println(l3)

    //统计不同性别的人
    val m1 = l3.map(x=>x._1->x._2.size)
    println(m1)
  }

}
