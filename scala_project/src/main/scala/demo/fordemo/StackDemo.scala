package demo.fordemo

object StackDemo {
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.pop)  // prints 2
    println(stack.pop)

    println("==============")
    val stack2 = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana
    stack2.push(apple)
    stack2.push(banana)
  }

  class Stack[A] {
    private var elements: List[A] = Nil
    def push(x: A): Unit ={
      //将elements放到了一个将元素x添加到elemetns的头部而生成的新列表中
      elements = x :: elements
    }

    def peek: A = elements.head

    def pop(): A = {
      val currentTop = peek
      println("****:"+elements)
      elements = elements.tail
      println("===:"+elements)
      currentTop
    }
  }

}

class Fruit

class Apple extends Fruit

class Banana extends  Fruit

