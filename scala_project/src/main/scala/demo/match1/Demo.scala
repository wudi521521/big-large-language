package demo.match1

import demo.match1.SingleDemo.info

object Demo {
  def main(args: Array[String]): Unit = {
    val project1 = new Project("TPS Reports", 1)
    val project2 = new Project("Website redesign", 5)
    info("Created projects")  // Prints "INFO:
  }

}

class Project(name: String, daysToComplete: Int)
