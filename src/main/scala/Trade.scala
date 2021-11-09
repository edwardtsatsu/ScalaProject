import java.util.Date
import scala.Byte.MaxValue.>=
// the scala implementation is simple as compared to java
//constructor
class Trade (var price: Double, val symbol: String, val id: String, val quantity: Int) {

  def price_(value: Double) = { if (value >= 0) this.price = value }

  def value() = {
    quantity*price
  }

  override def toString = s"Trade($price, $symbol, $id, $quantity)" //string interpolation

}

object Trade{
  def apply(price:Double,symbol: String, id:String, quantity:Int): Trade = {
    require(price >= 0)
      new Trade(price,symbol,id,quantity)
  }
}


//case class Trade(price:Double,symbol:String,id:String,quantity:Int)
