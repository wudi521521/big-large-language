package mc

object LogMainDemo {
  class ControllerLog extends Logger {

    override def log2(msg: String): Unit = {
      println("**********"+msg)
    }
  }

  def main(args: Array[String]): Unit = {
    val result = new ControllerLog with Logger2 {
      override def log(msg: String): Unit = {
        println("新增加的特质 ")
      }
    }
    result.log2("hello world")
  }

}
