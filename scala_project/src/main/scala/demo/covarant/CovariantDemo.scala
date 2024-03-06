package demo.covarant

object CovariantDemo {
  def main(args: Array[String]): Unit = {
    val myCat: Cat = Cat("Boots")

    def printMyCat(printer: Printer[Cat]): Unit = {
      printer.print(myCat)
    }

    val catPrinter: Printer[Cat] = new CatPrinter
    val animalPrinter: Printer[Animal] = new AnimalPrinter

    printMyCat(catPrinter)
    printMyCat(animalPrinter)
  }

  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach { animal =>
      println(animal.name)
    }
  }
}

//协变
abstract class Animal{
  def name: String
}

case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal

//逆变
abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal]{
  override def print(value: Animal): Unit = {
             println("The animal name is:"+value.name)
  }
}

class CatPrinter extends Printer[Cat]{
  def  print(cat: Cat): Unit={
    println("The cat name is:"+cat.name)
  }
}


