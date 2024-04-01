package mc.fcn

object ForeachDemo {
  def main(args: Array[String]): Unit = {
    //定义一个列表
    val l = List(1,2,3,4)
    //通过foreach函数遍历上述列表
    l.foreach((x:Int)=>
      println("===="+x)
    )
    //简写版本
    l.foreach(x=>println(x))
    for (elem <- l) {
      println(elem)
    }
    println("===="*3)
    //如果函数参数只有函数体出现一次，并且函数体没有涉及到复杂的使用，此时就可以使用下划线的方式来优化函数定义
    l.foreach(println(_))
  }

}
