package mc.fcn

/**
 * 学生数据的处理
 */
object Demo {
  def main(args: Array[String]): Unit = {
    //格式：姓名，语文成绩，数学成绩，英语成绩
    val l1=List(("张三",37,90,100),("李四",90,73,81),("王五",60,90,76),("赵六",59,21,72),("田七",100,100,100))
    //1:语文成绩60分
    val l2= l1.filter(x=>x._2>=60).map(x=>x._1)
    println(l2)
    //2:获取所有同学的总成绩
    val  l3 =l1.map(x=>x._1->(x._2+x._3 +x._4 ))
    println(l3)
    //3：程序降序
    val l4= l3.sortBy(x=>x._2).reverse
    println(l4)

  }

}
