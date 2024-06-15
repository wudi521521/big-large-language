package demo.eq18

object IterableGroup {
  def main(args: Array[String]): Unit = {
    //1:定义Iterable集合，存储1到13之间的数字
    val list :List[Int] =(1 to 13).toList

    //2 通过grouped方法按照5个元素一组的方式，对iterable集合分组
    val result1 = list.grouped(5)

    //3:遍历元素，打印结果
    while(result1.hasNext){
      println(result1.next().toString())
    }

    //3.1 foreach普通遍历
    result1.foreach((x:List[Int])=>println(x.toString()))

    //3.2 优化后遍历
    result1.foreach(println(_))
  }

}
