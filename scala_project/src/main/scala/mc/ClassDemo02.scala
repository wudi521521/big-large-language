package mc

object ClassDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new Customer(Array("张三","lisi"))
    println(c.address)
    println(c.name)
  }
}

class Customer(val name:String ,val address:String){
  //定义辅助构造器接收一个数组类型的参数
  def this(arr:Array[String]){
    //辅助构造器，第一行必须调用构造器
    this(arr(0),arr(1))
  }
}