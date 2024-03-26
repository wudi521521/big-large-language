package mc

object ClassDemo01 {

  def main(args: Array[String]): Unit = {
     val person = new Person();
     println(person.age)
    println(person.name)
  }
}
//默认类型是val,且是私有
class Person(){
  val name:String=""
  var age:Int=_

  def getName=println(name)

  def updateAge(age2:Int) ={
    age=age2
    println(age)
  }

}
