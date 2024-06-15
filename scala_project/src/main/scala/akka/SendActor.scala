package akka

import akka.actor.Actor

//自定义的用来发送消息的Actor对象

/**
 * 细节：
 * 在Actor并发编程模型中，实现act()方法，如果想持续接收消息，需要通过loop()和react()组合方法实现
 * 在Akka并发编程模型中
 */
object SendActor extends Actor {
  //不管接收到的是什么，先打印再说
  override def receive: Receive = {
    case "start" => {
      // 接收Entrance发送过来的消息，Start

      // 打印接收到的消息
      println("SendActor 接收到消息: Start")
      //获取ReceiveActor的路径
      //格式：akka://actorSystem的名字/user/具体的要获取的Actor对象的名字
      val receiverActor= context.actorSelection("akka://actorSystem/user/receiverActor")
      //给ReceiveActor发送一句话，采用样例类封装
      receiverActor ! SubmitMessage("我是SendActor 我要给你发信息啦")
      // 接收ReceiveActor返回的 回执信息
    }

    case SuccessSubmitMessage(msg)=>println(s"SendActor接收到的消息：${msg  }")

  }
}
