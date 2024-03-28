package mc.case1

object CaseDemo {
  case class Person(var name:String,var age:Int){//val是可以省略不写

  }

  case class People(){

     var name:String=""

    var age:Int=12
  }
  def main(args: Array[String]): Unit = {
    val p = Person("张三",2)
    println(p.name)
    println(p.age)
    val p2 = p.copy(age=23)
    println("===="+(p==p2))
    println("equals====="+(p.equals(p2)))
    println("eq======="+(p.eq(p2)))
    p2.name="lisi"
    println(p2)
    

  }


}
