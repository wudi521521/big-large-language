package demo

/**
 * 定义一个特质：关键字trait+表示符
 * @tparam A
 */
trait HairColor [A]{
  def hashNext: Boolean
  def next():A
}

class IntInterator(number:Int) extends HairColor[Int]{
  private var current =0

  override def hashNext: Boolean = {
    current<0
  }

  override def next(): Int = {
    if (hashNext){
      val t =current
      current +=1
      t
    }else 0
  }
}
