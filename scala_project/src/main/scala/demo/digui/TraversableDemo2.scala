package demo.digui

/**
 * 细节：集合的转置操作类似于变行
 */
object TraversableDemo2 {
  def main(args: Array[String]): Unit = {
    //1:定义一个Traversable集合t1，它有三个元素，每个元素都是Traversable集合，并分别存储如下数据
    val t1:Traversable[Traversable[Int]] =Traversable(Traversable(),Traversable(),Traversable())
    //2:第一个元素存储(1,4,7)第二个元素存储（2，5，8）第三个元素存储（3，6，9）
    val t2:Traversable[Traversable[Int]] = t1.transpose
    //3：通过transpose方法，对集合进行转置操作
    println(t2)
    //4：打印结果

  }

}
