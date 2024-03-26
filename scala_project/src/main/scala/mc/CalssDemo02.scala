package mc

object CalssDemo02 {
   //定义半生类
   class  Geneanls2( val name:String){

   }

  //半生对象
  object Geneanls2{

    //apply()方法Scala会自动调用
    def apply(name:String)={
      new Geneanls2(name+"ss")
    }

  }

  def main(args: Array[String]): Unit = {
  val g =  Geneanls2("zhagnsan")
    println(g.name)

  }

}
