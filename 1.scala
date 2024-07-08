import scala.io.StdIn
object demo1 {
  val items = Array("soap", "fruit juice", "books", "pen", "pencil", "eraser")
  val quantity = Array(6, 4, 10, 20, 30, 40)

  def displayinvent(): Unit = {


    println("list of the inventory items names and quantity ")
    for(i <- items.indices)
      {
          println(items(i) +" " + quantity(i) + "\n")

      }

  }

  def restock(name: String , quant: Int): Unit = {
    var count=0
    for(i<- items.indices)
      {
        if(items(i) == name)
          {
            quantity(i) = quantity(i) + quant
            count=count+1
          }
      }

      if(count<1)
        {
          println("your item is not sale or restore in our store")
        }

        println("now available items and quantity are : ")
        for(i <- items.indices)
          {
            println(items(i) + " " + quantity(i) + "\n")
          }


  }

  def sell(name: String, quant: Int): Unit = {
    var count = 0
    for (i <- items.indices)
      {
        if (items(i) == name) {
          quantity(i) = quantity(i) - quant
          count = count - 1
        }
      }

      if (count < 1)
        {
          println("your item is not sale or restore in our store")
        }

        println("now available items and quantity are : ")
        for (i <- items.indices) {
          println(items(i) + " " + quantity(i) + "\n")
        }


  }


  def main(args: Array[String]) : Unit = {

    displayinvent()
    println("how many items do you want to buy \n ")
    var res1= StdIn.readLine().toInt


    for(j <-0 until res1 )
      {
        println("enter the item which you want to buy : ")
        var res2= StdIn.readLine().toString

        println("enter the quantity this item which you want to buy : ")
        var res3=StdIn.readLine().toInt
        restock(res2,res3)


      }

      for (j <- 0 until res1) {
        println("enter the item which you want to add : ")
        var res4 = StdIn.readLine().toString

        println("enter the quantity this item which you want to add : ")
        var res5 = StdIn.readLine().toInt
        sell(res4, res5)


      }


  }

}
