package mc.gfcn

object ClassDemo {
  def main(args: Array[String]): Unit = {
    //1:定义列表，记录函数可以作为对象
     val l1= (1 to 10).toList
    //2：定义函数对象，用来将int-》String(元祖)
     val func = (x:Int)=>{"*"*x}
    //3：调用map方法，将第一步的列表转换成目标列表
    val l2= l1.map(func(_))
    println(l2)


    //匿名函数
    val l3 = l1.map((x:Int)=>"*"*x)
    println(l3)

    //优化函数_优化
     val l4 = l1.map("*"*_)
    println(l4)
  }
}
