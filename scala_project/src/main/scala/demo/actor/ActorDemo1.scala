package demo.actor

import akka.actor.{Actor, ActorSystem, Props}



/**
 * 创建两个Actor，一个Actor打印1-10，另一个Actor打印11-20
 */
object ActorDemo1 {
  def main(args: Array[String]): Unit = {
    val ss = ActorSystem("HelloSystem")
    val hh = ss.actorOf(Props[Actor1 ],name="actor1")
    hh !"key"
    hh ! "good morning"
  }

  class Actor1 extends Actor {
    override def receive: Receive = {
      case "key"=>println("收到key")
      case _=>println("没有消息")
    }
  }

  class Actor2 extends Actor {
    override def receive: Receive = {
      case "name"=>println("name")
    }
  }
}
