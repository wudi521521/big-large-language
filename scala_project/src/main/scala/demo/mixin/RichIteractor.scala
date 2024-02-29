package demo.mixin

trait RichIteractor extends AbsIterator {
  def foreach(f:T =>Unit): Unit=while (hasNext)f(next())
}
