//A singleton object that extends the App class
object myObject extends App { //because we have a static main method in App
  val tradeInstance  = new Trade(34.4,"V",56,45)
  println(s"The trade  has = : $tradeInstance")

//  val mytrade = new Trade()...........


//  val s = new Person("edward")
//  println(s.name)


//  val people = List(new Person("edward"),new Person("Kofi"))
//  val p1: List[String] = people.map(p => p.name)
//  val p2: List[String] = p1.filter(n => n.length > 5)
//    p1.foreach(println)

  // val gives you only reader
  // var gives you a reader and a writer
  // a constructor with no argument is a default constructor

  //Auxiliary constructors
//  def this()={
//    this(1,1,1)
//  }
//
//  def this(w:Int, h: Int){
//    this.(w,h,1)
//  }



}

//class Person(val name:String)