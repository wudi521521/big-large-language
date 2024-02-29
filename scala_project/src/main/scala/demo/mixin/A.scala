package demo.mixin

abstract class A {
  val message: String
}

class B extends A{
  val message = "I'm an instance of class B"
}

trait C extends A{
  def loudMessage = message.toUpperCase()
}

class D extends B with C{

}