package mc.matchs

object PartialMapDemo {
  def main(args: Array[String]): Unit = {
    val l1=(1 to 10).toList
    val l2 =  l1.map{
      case x if x>=1 && x<=3 =>"[1-3]"
      case _=>"(8-10]"
    }
    println(l2)
  }

}
