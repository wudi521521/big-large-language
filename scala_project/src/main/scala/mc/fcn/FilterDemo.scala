package mc.fcn

object FilterDemo {
  def main(args: Array[String]): Unit = {
    //定义一个列表
    val l = (1 to 9).toList
    println(l)

    //格式1
    //过滤出所有的偶数
   val l2= l.filter(x => x % 2 == 0)
    println(l2)

    //格式2
    val l3= l.filter(_ % 2 == 0)
    println(l3)
  }

}
