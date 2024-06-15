package com.wudi

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * 程序的入口
 */
object Master {
  def main(args: Array[String]): Unit = {
    //创建ActorSystem对象，用来管理所有的用户定义Actor
    val actorSystemSystem = ActorSystem("actorSystem", ConfigFactory.load())
    //通过ActorSystem，关联MasterActor
    val masterActor = actorSystemSystem.actorOf(Props(MasterActor), "masterActor")
    //给MasterActor发送一个测试数据
    masterActor ! "hello"
  }

}
