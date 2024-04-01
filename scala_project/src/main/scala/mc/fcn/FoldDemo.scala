package mc.fcn

object FoldDemo {
  def main(args: Array[String]): Unit = {
    //格式1
    val l1 = (1 to 9).toList
    //fold方法计算所有的元素和
    val l2= l1.fold(100)((x,y)=>x+y)
    println(l2)

    //格式2：
    val l3= l1.fold(100)(_+_)
    println(l3)
  }

}
