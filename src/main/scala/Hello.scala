import java.text.SimpleDateFormat

object Hello {

  def main(args: Array[String]): Unit = {
    println("hello world I am in scala!")
    add(4,6)
    convertCelsiusToFahrenheit(7)
    convertStringContainingDate("01/02/15")

  }


  def convertCelsiusToFahrenheit(value: Double): Unit ={
    val con = (value * 9 / 5 ) + 32
    println(s"The value for $value celsius to fahrenheit is = : $con")

  }

  def add(num:Int, num2: Int): Unit ={
    val total = num + num2
    println(s"the addition of the two numbers are =  $total")
  }


  def convertStringContainingDate(date: String): Unit ={
    val input = new SimpleDateFormat("dd/MM/y")
    val output = new SimpleDateFormat("dd MMMM y")
    println(output.format(input.parse(date)))
  }


}
