//A singleton object that extends the App class
object myObject extends App { //because we have a static main method in App
  val myTrade  = new Trade(34.4,"V",56,45)
  println(s"The trade has: $myTrade")




}
