package demo.match1

/**
 * 单例对象
 */
object SingleDemo {
  def main(args: Array[String]): Unit = {

  }

  //方法info可以在程序中的任何地方被引用，像这样创建功能性方法是单例对象的一种常见方法
  //Object 中的方法可以直接引用
  def info(message: String): Unit=println(s"INFO: $message")

}
