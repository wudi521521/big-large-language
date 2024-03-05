package demo.match1

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    println(showNotification(Email(sender="nihao",title = "title", body = "body")))

  }

  def showNotification(notification: Notification): String ={
       notification match {
         case Email(sender,title,_) =>{ s"you got an email from $sender with title: $title"}
         case SMS(number,message)=>{s"you got an SMS from $number with title: $message"}
         case VoiceRecording(name,link)=>  {s"you got an VoiceRecording from $name with title: $link"}
       }
  }

}

/**
 * Notification是一个虚基类，它有三个具体的子类Email,SMS和VoiceRecording
 */
abstract class Notification

case class Email(sender: String,title:String,body:String) extends Notification

case class SMS(caller: String,message: String) extends Notification

case class VoiceRecording(contactName: String,link: String) extends Notification


