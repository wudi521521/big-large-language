package demo.function

/**
 * sortBy:对集合中元组的某个元素进行排序
 */
object SortByMain {
  def main(args: Array[String]): Unit = {
    var list =List(("zhangsan",100),("lisi",200),("zhansi",300))
    println(list.sortBy(t=>t._2).reverse)
    //List集合中存储一个学生的信息，分别是姓名和语文成绩，数学成绩
    //请按照语文成绩先排序，语文成绩相等者，按照数学成绩排序
    var list2 = List(("zhangsan",100,58),("李四",84,96),("王五",84,75),("赵六",30,61))
    println(list2.sortBy(v=>(v._2,v._3))(Ordering.Tuple2(Ordering.Int,Ordering.Int.reverse)))
  }

}
