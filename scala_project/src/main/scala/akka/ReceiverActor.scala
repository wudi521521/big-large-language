package akka

import akka.actor.Actor

//自定义的用来接收消息的Actor对象

/**
 * 细节：
 * 在Actor并发编程模型中，实现act()方法，如果想持续接收消息，需要通过loop()和react()组合方法实现
 * 在Akka并发编程模型中
 */
object ReceiverActor extends Actor{
  //不管接收到的是什么，先打印再说
  override def receive: Receive = { 
    case SubmitMessage(msg)=> {
      //接收
      println("我是ReceiverActor 我接收到了: "+msg)
      //打印
     sender ! SuccessSubmitMessage("任务接收成功--》回执信息")
      //给发送者一个回执信息
    }

  }
}
