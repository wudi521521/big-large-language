package mc.fcn

object MapDemo {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4)
    //普通方法
   val l2 = l.map((x:Int)=> {"*"*x})
    println(l2)
    //类型推断
    val l3=l.map(x=>"&"*x)
    println(l3)

    //下划线
    val l4 = l.map("$"*_)
    println(l4)
   }



}
