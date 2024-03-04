package demo.method

object CaseClassDemo {

  def main(args: Array[String]): Unit = {
    //注意在实例化样例类Book时，并没有使用关键字new，这是因为例类有一个默认的apply方法来负责对象的创建
    //不能给book重新赋值，因为它时一个val(不可变)，在例类中使用var也是可以的，但是不推荐使用var
    val book = Book("张三")
    println(book.isbn)

    val book1 = Book("张三")

    var store = Store("zhaosi")
    println(store.name)
    store.name="lisi"
    println(store.name)
    //比较,book和book1引用不同的对象，但是它们的值是相等的，所以book == book1为true,
    //eq方法比较的是俩个字符串的首地址值是否相同
    println(book==book1)
    println(book.eq(book1))

    //COPY copy方法创建一个样例类的浅拷贝，同时可以指定构造参数来做一些改变
    //copy方法会返回一个新的对象副本，原始对象不会被修改
    //在使用copy方法时，可以选择性指定要修改的属性，其他属性将保持不变
    //copy方法仅适用于不可变（immutable）类和样例类
    val book2 = book.copy(isbn = book.isbn)
    println("=======================")
    println(book2.eq(book))



  }

}

case class Book(isbn: String)

case class Store(var name: String)
