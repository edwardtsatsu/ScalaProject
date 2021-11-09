import java.util.Date

// the scala implementation is simple as compared to java
//constructor
class Trade (var price: Double, val symbol: String, val id: Int, val quantity: Int) {


  override def toString = s"Trade($price, $symbol, $id, $quantity)" //string interpolation
  //ef ?!()// operators are methods eg +
  // def apply(x: Int): Int = x + 1
  //case class can be generated or instance without the new keyword
 // exception
//  try {
//    val x: String = null
//    x.length
//  }catch {
//    case e:Exception => " some faculty error message"
//  }finally {
//    //execute some code no matter what !
//  }

//  //generics
//  abstract class myList[T]{
//    def head: T
//    def tail: myList[T]
//  }
//  val aList: List[Int] = List(1,2,3,4) // list.apply(1,2,3,4)
//  val first = aList.head //int
//  val rest = aList.tail
//  val aStringList = List("HELLO","HELLO I AM HERE")
//  val firstString = aStringList.head //string


}
