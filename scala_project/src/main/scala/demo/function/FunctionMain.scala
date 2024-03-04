package demo.function

object FunctionMain {
  def main(args: Array[String]): Unit = {
   /* //map:将集合中的每一个元素通过指定功能（函数）映射（转换）成新的结果集
    val list1 = List(1, 2, 3)
    val result =  addN(2)
    println(list1.map(result))*/
    val salaries = Seq(20000,70000,4000)
    val result = salaries.map(x=>x*200)
    println(salaries)
    println(result)
  }

  def functionMap: Unit = {
    val list1 = List(1, 2, 3)
    //匿名函数
    val list2 = list1.map(v => v * 2)
    println(list2)
  }

  def functionMap2: Unit = {
    val list1 = List(3, 5, 10)
    //函数
    val add = (x: Int) => x * 2
    val list2 = list1.map(add)
    println(list2)
  }

  //接收一个整数，返回一个函数
  def addN(n: Int): Int => Int = {
    (x: Int) => x * n
  }

}
