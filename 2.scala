import scala.io.StdIn
object demo2{

  def main(args: Array[String]): Unit = {

    println("Enter the number: ")
    var number=StdIn.readLine().toInt

     number match {
      case 0 => println("number is zero")
      case n if n < 0 => println(s"$number is a negative number")
      case n if n % 2 == 0 => println(s"$number is an even number")
      case _ => println(s"$number is an odd number")
    }
  }

}
