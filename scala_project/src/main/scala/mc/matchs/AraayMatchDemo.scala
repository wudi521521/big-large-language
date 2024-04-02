package mc.matchs

object AraayMatchDemo {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1,2,3)
    val arr2 = Array(0)
    val arr3 = Array(0,1,2,3,4,5,6)
    arr1 match {
      case Array(1,x,y)=>println(s"匹配到数组：长度为3，首元素为1，剩下两个元素无所谓：${x} ,${y}")
      case Array(0)=> println(s"匹配到数组：长度为1，首元素为0")
      case Array(0,_*)=>println(s"匹配到数组：以元素0开头，后边的元素无所谓")
      case _=>println("未匹配")
    }
  }

}
