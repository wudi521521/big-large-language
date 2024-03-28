package mc.case1

import org.xml.sax.SAXException

object CaseObjectDemo {
  def main(args: Array[String]): Unit = {
    new Person(Female)

  }
  class Person(sex:Sex2){}
  trait Sex2

  //样例对象
  case object Male extends Sex2

  case object Female extends Sex2
}
