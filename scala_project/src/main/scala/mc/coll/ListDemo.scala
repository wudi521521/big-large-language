package mc.coll

/**
 * 不可变列表
 */
object ListDemo {
  def main(args: Array[String]): Unit = {
      //格式1var/ val 变量名 = List(元素1,元素2,元素3,元素4)
       val l1 = List("zhangsan",1)
      //格式2var/ val 变量名 = Nil
       val l2 = Nil
      //格式3 var/ val 变量名 = 元素1::元素2:Nil
       val l3 = "zhangsan"::"lishi"::Nil
    println("l1:"+l1.size+"==")
    println("l2:"+l2.size+"==")
    println("l3:"+l3.size+"==")
    
  }

}
