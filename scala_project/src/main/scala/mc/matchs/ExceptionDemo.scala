package mc.matchs

object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    try{
    val i = 10/0
    }catch {
          //可能出现的问题

      case ex: Exception=> ex.printStackTrace()
      case ex: ArithmeticException=> println("异常")
    }finally {
      println("----------")
    }
    println("你好")
  }

}
