package demo.digui

//斐波那契案例
object ClassDemo3 {
  /**
   * 需要已知数列：1，1，2，3，5，8，12 问第12个月有几对兔子
   * @param args
   */
    def add(number:Int):Int={
      if (number==1 || number==2) 1
      else add(number-1)+add(number-2)
    }
  def main(args: Array[String]): Unit = {
    val number =add(3)
    println(number)

    val number2 = add(12)
    println(number2)

  }

}
