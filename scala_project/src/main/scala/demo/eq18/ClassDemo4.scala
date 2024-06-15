package demo.eq18

object ClassDemo4 {
  def main(args: Array[String]): Unit = {
    //定义集合
    val list = Iterable("A","B","C")
    //通过sameElements()方法，判断list和Iterable集合是否相同
    println(list.sameElements(Iterable("A","B","C")))
    //通过sameElements（）方法，判断list和Iterable（"A","B","D"）
    println(list.sameElements(Iterable("A","B","D")))
  }

}
