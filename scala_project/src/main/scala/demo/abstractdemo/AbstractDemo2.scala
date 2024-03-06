package demo.abstractdemo

object AbstractDemo2 {
  def main(args: Array[String]): Unit = {
    val dogContainer = new PetContainer[Dog](new Dog)
    val catContainer = new PetContainer[Cat](new Cat)

  }
}

abstract class Animal{
  def name: String
}

abstract class Pet extends Animal{}

class Cat extends Pet{
  override def name: String = "Cat"
}

class Dog extends Pet{
  override def name: String = "Dog"
}

class PetContainer[P <: Pet](p: P) {
  def pet: P = p
}


