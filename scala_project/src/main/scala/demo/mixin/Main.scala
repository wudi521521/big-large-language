package demo.mixin

object Main {
  def main(args: Array[String]): Unit = {
  val richStringIter = new RichStringIter
  richStringIter foreach println
    richStringIter.foreach(println)
  }

}
