package demo.fordemo

object ForTest {

  def main(args: Array[String]): Unit = {
    val userBase = List(User("Travis", 28),
      User("Kelly", 33),
      User("Jennifer", 44),
      User("Dennis", 23))
    val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
      //在for循环中，yield可以用来生成一个新的集合。
      yield user.name

    twentySomethings.foreach(name=>println(name))

  }

}

case class User(name: String,age: Int)


