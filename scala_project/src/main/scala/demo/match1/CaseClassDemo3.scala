package demo.match1

object CaseClassDemo3 {
  def main(args: Array[String]): Unit = {
 println(findPlaceToSit(Couch()))
  }

  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }
}

sealed abstract class Furniture

case class Couch() extends Furniture

case class Chair() extends Furniture
