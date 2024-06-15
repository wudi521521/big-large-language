package akka

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * 程序入口
 */
object Entrance {
  def main(args: Array[String]): Unit = {
    //创建自定义的Actor的对象，上述的步骤已经实现了

    //通过ActorSystem用来管理我们自定义的Actor
   val actorSystem = ActorSystem("actorSystem",ConfigFactory.load())
    //通过ActorSystem,来加载自定义的Actor
    //参数1：具体的被ActorSystem管理的 自定义的Actor对象
    //参数2：该Actor对象的名字
    val sendActor= actorSystem.actorOf(Props(SendActor),"sendActor")
    val receiverActor= actorSystem.actorOf(Props(ReceiverActor),"receiverActor")
    //异步发送消息
    sendActor ! "start"

  }
}
