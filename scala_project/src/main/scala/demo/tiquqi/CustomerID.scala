package demo.tiquqi

import scala.util.Random

object CustomerID {
  def main(args: Array[String]): Unit = {
    val customerID = CustomerID("Sukyoung")

  }

  def apply(name: String) = s"$name--${Random.nextLong()}"

  def unApply(customerID: String): Option[String] ={
    val stringArray: Array[String] = customerID.split("==")
    if(stringArray.tail.nonEmpty) Some(stringArray.head) else None

  }
}
