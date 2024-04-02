package mc.matchs

object ForDemo {
  def main(args: Array[String]): Unit = {
    val l1 = Map("liu"->"男","lx"->"女","hg"->"男")
    //格式1：守卫
    for ((k,v)<-l1 if v.eq("女")) println(s"${k} & ${v} ")
    //取固定值：
    for ((k,"男")<-l1 ) println(s"${k} & ")
  }

}
