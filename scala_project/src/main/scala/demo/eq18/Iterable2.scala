package demo.eq18

object Iterable2 {
  def main(args: Array[String]): Unit = {
    //定义列表
    val list = (1 to 5).toList
    //2通过iterator（）方法遍历上述的列表
    val it: Iterator[Int] = list.iterator

    //2.1 判断是否还有下一个元素，因为不知道集合中到底有多少哥元素，所以要采用循环来实现
    while (it.hasNext) {
      //2.3 通过next()方法来获取指定的元素
      val num = it.next()
      println(num)
    }

    println("-" * 15)
    //3 通过foreach() 方法遍历上述的列表
    //3.1 普通版本
    list.foreach(item=>{
      println(item)
    })

    println("-" * 15)
    //3.2 普通版本
    list.foreach((x:Int)=>println(x ))
    println("-" * 15)
    //3.3 优化版本
    list.foreach(println(_))

  }

}
