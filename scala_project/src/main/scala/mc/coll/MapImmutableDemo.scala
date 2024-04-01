package mc.coll
import scala.collection.mutable.Map
object MapImmutableDemo {
  def main(args: Array[String]): Unit = {
    //格式1
    val map1 = Map("zhangsan"->12,"李四"->21)
    //格式2
    val map2 = Map(("zhangsan"->12),("李四"->21))
    map1.put("zhangsan",30)
    //遍历打印
    for((k,v)<-map1) println(k,v)
    println("-"*15)
    //getElse
    println(map1.getOrElse("wangwu",-1))
    println(map1)
    println(map2)

  }

}
