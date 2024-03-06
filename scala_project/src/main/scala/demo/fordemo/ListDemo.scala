package demo.fordemo

/**
 * head 表示数组的第一个元素
 * tail表示数组除去head后的数组
 * last表示数组的最后一个元素
 * init表示数组除去last后的数组
 */
object ListDemo {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(0,1,2,3,4)
    println(array.head)
    println(array.tail.mkString("Array(",",",")"))
    println(array.init.mkString("Array(",",",")"))
  }

}
