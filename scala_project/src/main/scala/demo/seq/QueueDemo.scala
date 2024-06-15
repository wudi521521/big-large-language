package demo.seq

import scala.collection.mutable

object QueueDemo {
  def main(args: Array[String]): Unit = {
    val l = mutable.Queue(1,2,3,4,5)
    //add element by enqueue
    l.enqueue(6)
    println(l)
    l.enqueue(7,8)
    println(l)
    //remove first element by dequeue
    l.dequeue()
    println(l)
    //remove first odd number element
    l.dequeueFirst(_% 2 !=0)
    println(l)
    //remove all double number element
    l.dequeueAll(_%2==0)
    println(l)

  }

}
