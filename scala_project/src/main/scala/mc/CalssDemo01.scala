package mc

object CalssDemo01 {
   //定义半生类
   class  Geneanls{
     def toWar: Unit ={
       println("拿着武将"+s"${Geneanls.name}")
     }
   }

  //半生对象
  object Geneanls{
    private val name = "青龙偃月刀"
  }

  def main(args: Array[String]): Unit = {
    val c = new Geneanls()
    c.toWar

  }

}
