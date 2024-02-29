package demo.mixin

class StringIterator(s: String) extends AbsIterator {
  override type T = Char

  private var i = 0

  def hasNext: Boolean = i < s.length

  def next() ={
    val ch = s charAt(i)
    i+=1
    ch
  }
}
