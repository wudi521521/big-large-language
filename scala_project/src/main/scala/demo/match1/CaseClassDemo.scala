package demo.match1

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    println(showNotification(Email(sender="nihao",title = "title", body = "body")))
    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val someSms = SMS("867-5309", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    println(showImportantNotification(someSms, importantPeopleInfo))
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo))
    println(showImportantNotification(importantEmail, importantPeopleInfo))
    println(showImportantNotification(importantSms, importantPeopleInfo))
  }

  def showNotification(notification: Notification): String ={
       notification match {
         case Email(sender,title,_) =>{ s"you got an email from $sender with title: $title"}
         case SMS(number,message)=>{s"you got an SMS from $number with title: $message"}
         case VoiceRecording(name,link)=>  {s"you got an VoiceRecording from $name with title: $link"}
       }
  }

  def showImportantNotification(notification: Notification,importantPeopleInfo: Seq[String]): String ={
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other)
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


