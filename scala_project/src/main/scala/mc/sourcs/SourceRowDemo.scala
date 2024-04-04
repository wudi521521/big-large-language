package mc.sourcs

import scala.io.{BufferedSource, Source}

object SourceRowDemo {
  def main(args: Array[String]): Unit = {
    //获取传递路径
    val source:BufferedSource = Source.fromFile("/Users/wudi/1.log","utf-8")
    //按照字符读取
    val iter:BufferedIterator[Char] = source.buffered
   while (iter.hasNext) {
     println(iter.next())
   }
    source.close()
   }
}
