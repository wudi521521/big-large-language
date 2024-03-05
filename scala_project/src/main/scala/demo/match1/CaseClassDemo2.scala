package demo.match1

object CaseClassDemo2 {
  def main(args: Array[String]): Unit = {
  println(goIdle(Phone("phone")))
  }

  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }
}


abstract class Device
case class Phone(model: String) extends Device  {
  def screenOff = "Turning screen off"
}
case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}


