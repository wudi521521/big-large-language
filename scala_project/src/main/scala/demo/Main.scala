package demo

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
  val pair=(1,2.2,"中国")
    //访问元组的元素
    println(pair._1)
    println(pair._2)
    println(pair._3)
    //解构元组数据
    val(name,quantity,age) = pair
    println(name)
    println(quantity)
    println(age)

    //元组解构也可用于模式匹配
    val planetDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6 ), ("Mars", 227.9), ("Jupiter", 778.3))
     planetDistanceFromSun.foreach(tuple=>{
       tuple match {

         case ("Mercury", distance) => println(s"Mercury is $distance millions km far from Sun")

         case p if(p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from Sun")

         case p if(p._1 == "Earth") => println(s"Blue planet is ${p._2} millions km far from Sun")

         case _ => println("Too far....")

       }
     })

  }

}
