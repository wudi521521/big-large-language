package mc.matchs

object PartialFunctinDemo {
  def main(args: Array[String]): Unit = {
    //定义偏函数，根据给定的整数，返回其对应的字符串
  val df:PartialFunction[Int,String] =  {
      case 1=>"-"
      case 2=>"--"
      case 3=>"---"
      case 4=>"----"
      case 5=>"-----"
    }
    println(df(2))
  }

}
