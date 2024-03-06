package demo.method

object InsertMethod {
  def main(args: Array[String]): Unit = {
  println("Factorial 2:"+factorial(2))
  println("Factorial 3:"+factorial(3))

  }

  def factorial(x: Int) ={
    def fact(x: Int,accumulator: Int): Int ={
      if(x <= 1) accumulator
      else fact(x-1,x*accumulator)
    }
    fact(x,1)
  }
}
