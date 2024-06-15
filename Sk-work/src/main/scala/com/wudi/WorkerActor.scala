package com.wudi

import akka.actor.Actor

/**
 * 节点
 * 负责管理的WorkerActor的路径是:akka.tcp://actorSystem@127.0.0.1:8000
 */
object WorkerActor extends Actor{
  override def receive: Receive = {
    case x=> println(x)
  }
}
