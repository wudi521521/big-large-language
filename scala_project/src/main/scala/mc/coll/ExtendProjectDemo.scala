package mc.coll

import scala.collection.mutable.ArrayBuffer

object ExtendProjectDemo {
  def main(args: Array[String]): Unit = {
    val ll = ArrayBuffer[Any]()
    ll.append("dfdf")
    ll.append(1)
    println(ll.mkString("=="))
    println(ll.size)
    ll+="wudi"
    println(ll)
    ll-=1
    println(ll)
    for (i<-ll) println(i)

  }
}
