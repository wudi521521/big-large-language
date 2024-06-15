package com.wudi

import akka.actor.Actor

/**
 * 自定义的MasterActor对象，用来管理多个：WorkerActor对象
 * 负责管理MasterActor的ActorSystem的路径是：akka.tcp://actorSystem@127.0.0.1:7000
 */
object MasterActor extends Actor{
  override def receive: Receive = {
    case x=> println(x)
  }
}
