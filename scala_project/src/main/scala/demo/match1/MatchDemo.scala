package demo.match1



import scala.util.Random

//包名和类名都不能起关键字的名称
object MatchDemo {
  def main(args: Array[String]): Unit = {

    println(matchDemoq)
    println(qq(4))
  }

  def matchDemoq:String={
  val x: Int=Random.nextInt(10)
    ////match:模式匹配是检查某个值（value）是否匹配某一个模式的机制，一个成功的匹配时同时会将匹配值解构为其组
    //  //成部分，它是java中的switch 语句的升级版，同样可以用于替代一系列的if/else 语句
    x match {
      case 0=> "zero"
      case 1=> "zero"
      case 2=> "two"
      case _=> "other"  //case_表示匹配其余所有情况
    }
  }

  //match表达式具有一个结果值
  def qq(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }

}
