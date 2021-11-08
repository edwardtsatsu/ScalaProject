import java.util.Date

// the scala implementation is simple as compared to java
class Trade (var price: Double, val symbol: String, val id: Int, val quantity: Int){


  override def toString = s"Trade($price, $symbol, $id, $quantity)"

}
