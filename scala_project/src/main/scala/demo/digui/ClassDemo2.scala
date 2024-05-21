package demo.digui

object ClassDemo2 {
  def fatorial(n:Int):Int = if(n==1)  1 else n*fatorial(n-1)
  def main(args: Array[String]): Unit = {
      val number = fatorial(5)
    println(number)
  }
}
