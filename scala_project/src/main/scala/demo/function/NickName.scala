package demo.function

object NickName {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    //正常的写法
    list.map((v:Int)=>v*2)
    //省略说法
    list.map(v=>v*2) //还可以继续简写 list.map(_*2)
    //reduce此处的（）不能省略
    list.reduce((v1,v2)=>v1+v2)
    //
  }

}
