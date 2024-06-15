package demo.seq

import java.util
import scala.collection.mutable

object SetDemo {
  def main(args: Array[String]): Unit = {
    //Hashset 唯一，hash排序
    val h = mutable.HashSet(1,2,34)
    println(h)
    //LinkedHashSet 唯一，顺序
    val l = mutable.LinkedHashSet(1,2,3,45)
    println(l)
    //SortSet 唯一 ，排序(默认升序)
    val s1 = mutable.SortedSet(1,2,4,3)
    println(s1)
  }

}
