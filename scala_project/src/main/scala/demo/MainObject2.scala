package demo

object MainObject2 {

}

//抽象类
abstract class A{
  val message: String
}

class B extends A{
  override val message: String = "======B======="
}

trait C extends A{
  def loudMessage = message.toUpperCase()
}

class D extends B with C{

}