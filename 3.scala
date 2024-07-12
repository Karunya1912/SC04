object demo3 {

  def toUpper(s: String): String = s.toUpperCase

  def toLower(s: String): String = s.toLowerCase

  def applyFormat(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val benny = applyFormat("Benny")(toUpper)
    val niroshan = applyFormat("Niroshan")(name => name.take(2).toUpperCase + name.drop(2))
    val saman = applyFormat("Saman")(toLower)
    val kumara = applyFormat("Kumara")(name => name.take(name.length - 1) + name.last.toUpper)

    println(benny)      // Output: BENNY
    println(niroshan)   // Output: NIroshan
    println(saman)      // Output: saman
    println(kumara)     // Output: KumarA
  }
}
