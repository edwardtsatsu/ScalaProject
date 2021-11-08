//A singleton object that extends the App class
object myObject extends App {
  val tradeInstance  = new Trade(34.4,"V",56,45)
  println(s"The trade  has = : $tradeInstance")


//  val s = new Person("edward")
//  println(s.name)


//  val people = List(new Person("edward"),new Person("Kofi"))
//  val p1: List[String] = people.map(p => p.name)
//  val p2: List[String] = p1.filter(n => n.length > 5)
//    p1.foreach(println)



}

//class Person(val name:String)