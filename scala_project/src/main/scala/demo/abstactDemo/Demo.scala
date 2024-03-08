package demo.abstactDemo

object Demo {
  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(7,8)
    println("length = "+buf.length)
    println("content = "+buf.element.mkString(","))
  }

  def newIntSeqBuf(elem1: Int,elem2: Int): IntSeqBuffer =
    new IntSeqBuffer {
       type T = List[U]
       val element =List(elem1,elem2)
    }

}
