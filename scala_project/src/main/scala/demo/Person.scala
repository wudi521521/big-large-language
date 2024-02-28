package demo

class Person(val name: String,var  age: Int) {
  private val _name: String = name
  private var _age: Int = age

  def getName(): String = _name

  def getAge: Int = _age

  def incrementAge: Unit = {
    _age += 1
  }

}
