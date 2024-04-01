package mc.fcn

object ReduceDemo {
  def main(args: Array[String]): Unit = {
    //格式1
    val l1 = (1 to 9).toList
    val l2 = l1.reduce((x,y)=>x+y)
    println(l2)

    //格式2
    val l3 =l1.reduce(_+_)
    println(l3)


  }

}
