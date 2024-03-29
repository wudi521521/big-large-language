package mc.coll

object ZipDemo {
  def main(args: Array[String]): Unit = {
    //拉链：将两个列表，组合成一个元素为元组的列表（将列表List（张三，李四），List（2，3）组合成List（（张三，2），（李四，3）））
     val l1 = List("张三","李四")
     val l2 = List(2,3)
    val l3= List("北京","上海")
     val ls= l2.zip(l1)
    val result = ls.zip(l3)
    println(ls)//结果List((2,张三), (3,李四))
    println(result)
    //拉开：将一个包含元组的列表，拆解成包含俩个列表的元组（将列表中的List（张三，23），（李四，34）拆分成元组List（张三，李四）List（23，24））
    val tuple1= ls.unzip
    println(tuple1._1.mkString("=="))
    println()
  }

}
