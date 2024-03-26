package mc

object DutyDemo {

  trait Data{
    def execute(data:String): Unit ={
      println("data 数据打印"+data)
    }
  }

  trait SignCheckData extends Data{
    override def execute(data:String): Unit ={
      println("data 数据打印 SignCheckData"+data)
      super.execute(data)
    }
  }

  trait CheckData extends Data{
    override def execute(data:String): Unit ={
      println("data 数据打印 CheckData"+data)
      super.execute(data)
    }
  }

  class Result extends CheckData with SignCheckData{
    override def execute(data: String): Unit = {
      println("=========开始=========")
      super.execute(data)
    }
  }

  def main(args: Array[String]): Unit = {
    val result = new Result
    result.execute("张三")
  }
}
