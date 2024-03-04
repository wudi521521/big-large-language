package demo.function

/**
 * fold函数将上一步返回的值作为函数的第一个参数继续传递参数与运算
 */
object FoldMain {
  def main(args: Array[String]): Unit = {
    var list = List(1,2,6,8)
    val i: Int = list.fold(5)((v1,v2)=>{v1+v2})
    println(i)
    //上述代码等同于
    val l: Int = List(5,1,2,6,8).reduce((v1,v2)=>v1+v2)
    println(l)
  }

}
