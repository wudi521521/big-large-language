package mc.gfcn

/**
 * 控制抽象函数指的是：如果一个函数的参数列表接收了一个无参数返回值的函数，那么这个函数就是抽象函数
 */
object ClassDemo3 {
  def main(args: Array[String]): Unit = {
    val myShop=(f1:()=>Unit)=>{
      println("welcome come in")
      f1()
      println("Thank for coming")
    }

    //调用Mshop函数
    myShop(()=>{
      println("购买1")
      println("购买2")
      println("购买3")
    })
  }

}
