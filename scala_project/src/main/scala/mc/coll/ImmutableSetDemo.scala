package mc.coll
import scala.collection.mutable.Set

/**
 * 可变集
 */
object ImmutableSetDemo {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1,2)
    val set2 = set1+=3
    println(set1)
    println(set2)
  }

}
