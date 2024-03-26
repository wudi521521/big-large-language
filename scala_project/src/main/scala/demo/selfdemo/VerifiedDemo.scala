package demo.selfdemo

/**
 * 自类型用于声明一个特质必须混入其他特质，尽管特质没有直接扩展其他特质，这使得所依赖的成员可以在没有导入情况下使用
 */
object VerifiedDemo {
  def main(args: Array[String]): Unit = {
    val realBeyonce = new VerifiedTweeter("Beyonce")
    realBeyonce.tweet("=============")
  }

}
