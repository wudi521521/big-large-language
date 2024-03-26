package demo.selfdemo

trait User {
    def username: String
}

trait Tweeter{
   this: User => //重新赋予 this 的类型
   def tweet(tweetText: String) = println(s"$username: $tweetText")
}

class VerifiedTweeter(val username_ :String) extends User with Tweeter{
  override def username: String =s"real $username_"
}
