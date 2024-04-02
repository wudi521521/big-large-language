package mc.matchs

object ListMatchDemo {
  def main(args: Array[String]): Unit = {
    val arr1 = List(1,2,3)
    val arr2 = List(0)
    val arr3 = List(0,1,2,3,4,5,6)
    arr2 match {
      case List(1,x,y)=>println(s"匹配到数组：长度为3，首元素为1，剩下两个元素无所谓：${x} ,${y}")
      case List(0)=> println(s"匹配到数组：长度为1，首元素为0")
      case List(0,_*)=>println(s"匹配到数组：以元素0开头，后边的元素无所谓")
      case _=>println("未匹配")
    }
    //格式2：通过关键字实现，Nil,tail
    arr2 match{
      case 0::Nil =>println("匹配列表：只包含一个元素0的列表")
      case 0::tail =>println("匹配列表：以元素0开头，其他元素无所谓的列表")
      case x::y::Nil =>println("匹配列表：只包含任意两个元素的列表，这里元素")
    }
  }

}
