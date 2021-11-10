import org.scalatest.funsuite.AnyFunSuite

class TradeTest extends AnyFunSuite{
  val myTrade1 = new Trade(79,"vic","valid1",67)

  //describe independent test
  test("The price of the trade class should be 78") {
    assert(myTrade1.price.==(79))
    assert(myTrade1.quantity.equals(67))
    assert(myTrade1.value.==(5293))

  }


}
