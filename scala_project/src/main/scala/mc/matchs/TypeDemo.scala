package mc.matchs

object TypeDemo {
  def main(args: Array[String]): Unit = {
    val a:Any = "hadoop"
    val result = a match {
      case a:String => s"${a} 是一个String类型"
      case a:Int => s"${a} 是一个Int类型"
      case a:Double => s"${a} 是一个Double类型"
      case _=> "其他类型"
    }
    println(result)

    //简写：变量没有表达是中被使用，则可以通过下划线来替代变量名
    val result2 = a match {
      case _:String => s"${a} 是一个String类型"
      case _:Int => s"${a} 是一个Int类型"
      case _:Double => s"${a} 是一个Double类型"
      case _=> "其他类型"
    }
    println(result2)
  }

}
