package demo.function

/**
 * groupBy:根据集合中包含元组进行分组
 */
object GroupByMain {
  def main(args: Array[String]): Unit = {
    var list = List(("张三",100),("张三",96),("李四",84),("李四",30))
    //.groupBy(v=>v._1) 作用：根据遍历集合获取元组的第一个元素进行分组
   var map: Map[String,List[(String, Int)]] = list.groupBy(v=>v._1)
  }

}
