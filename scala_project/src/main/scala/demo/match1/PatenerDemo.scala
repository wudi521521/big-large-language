package demo.match1

import scala.math.{Pi, pow}

/**
 * 这里的class circle 有一个成员area是和具体的实例化对象相关的，单例对象object circle 包含一个方法calculatearea，它在每一个
 * 实例化对象中都是可见的
 */
object PatenerDemo {
  def main(args: Array[String]): Unit = {
    val circle1 = Circle(5.0)
    println(circle1.area)
  }
  case class Circle(radius: Double){
    import Circle._
    def area: Double = calculateArea(radius)
  }
  object Circle {
    private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
  }
}



