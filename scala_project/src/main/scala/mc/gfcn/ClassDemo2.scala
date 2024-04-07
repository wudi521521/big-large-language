package mc.gfcn

/**
 * 柯里化
 */
object ClassDemo2 {
  //普通方式
  def merge1(str1:String,str2:String) =str1+str2

  //柯里化
  def merge2(str1:String,str2:String)(f1:(String,String)=>String) =f1(str1,str2)
  def main(args: Array[String]): Unit = {

  }

}
