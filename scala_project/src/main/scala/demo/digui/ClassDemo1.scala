package demo.digui

object ClassDemo1 {
  /**
   * 注意事项
   * 1：递归必须要有出口，否则容易造成死递归
   * 2：递归必须要有规律
   * 3：构造方法不能递归
   * 4：递归方法必须有，返回值的数据类型
   * @param args
   */
    var count = 1
    def show():Int ={
      println(s"第${count}调用show()方法")
      //递归指的是自己调用自己
      show()
      1
    }
  def main(args: Array[String]): Unit = {
         show()
  }

}
