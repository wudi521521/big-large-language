package mc.fcn

object FalltenMapDemo {
  def main(args: Array[String]): Unit = {
    val l1 = List("hadoop hive spark flink flume","kudu hbase sqoop storm")
    //方法一：先map，然后Flatten
    val l2 = l1.map(x=>{x.split(" ")})
    //println(l2.mkString)
    val l3 = l2.flatten
    println(l3)

    //方法2
 val l4 =   l1.flatMap(x=>x.split(" "))
    println(l4)

    //方法3
    val l5 =   l1.flatMap(_.split(" "))
    println(l5)
  }

}
