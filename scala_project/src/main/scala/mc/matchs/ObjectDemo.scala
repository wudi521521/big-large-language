package mc.matchs

object ObjectDemo {
  class Student(var name:String,var age:Int)

  object Student{
    //apply
    def apply(name:String,age:Int) =new Student(name,age)

    //unapply
    def unapply(s:Student)={
      if(null == s ) None
      else Some(s.name,s.age)

    }
  }
  def main(args: Array[String]): Unit = {
   val s1 = Student("zhangsan",8)
   val s2 =  Student.unapply(s1)
    println(s2.get)
  }

}
