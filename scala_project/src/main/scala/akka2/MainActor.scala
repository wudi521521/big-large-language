package akka2

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

object MainActor {

  object ReceiverActor extends Actor{
    override def receive: Receive = {
      case x=>println(x)
    }
  }

  def main(args: Array[String]): Unit = {
    //创建ActorSystem
    val actorSystemSystem = ActorSystem("actorSystem", ConfigFactory.load())
    val receiverActor = actorSystemSystem.actorOf(Props(ReceiverActor), "receiverActor")
    //导入隐式转换和隐式参数
    import actorSystemSystem.dispatcher
    //用来支持定时器
    import scala.concurrent.duration._

    //导入隐式参数，用来给定时任务设置默认值

    //通过定时器，定时间隔1秒给ReceiverActor发送一条
    //方式一采用发送消息的形式实现
    //actorSystemSystem.scheduler.schedule(3 seconds,2 seconds,receiverActor,"恭喜您成为本月的寿星")
    //  方式2采用自定义消息结合函数实现
//延迟3s，间隔2s
    actorSystemSystem.scheduler.schedule(3 seconds,2 seconds){
      receiverActor ! "恭喜您成为本月的寿星"+System.currentTimeMillis()
    }

  }
}
