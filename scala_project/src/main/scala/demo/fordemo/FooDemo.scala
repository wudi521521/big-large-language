package demo.fordemo

object FooDemo {
  def main(args: Array[String]): Unit = {
    foo(10,10).foreach{
      case (i,j)=> println(s"$i,$j")
    }
  }

  def foo(n:Int,v:Int) ={for (i <- 0 until n; j<- i until n if i+j==v) yield (i,j)}

}
