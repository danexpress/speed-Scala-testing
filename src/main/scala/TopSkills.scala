object TopSkills {
  val meaningOfLife = 40 + 2

  // 1 - immutability
  // recursion
  def loop(i: Int = 0): Unit = {
    println(i)
    if (i < 10)
      loop(i + 1)
  }

  // 2 - expressions vs instructions
  val anIfStatement =
    if (42 < 100) "Scala" else "Something not nice" // evaluted to "scala"

  def concatenateN(n: Int, s: String): String =
    if (n <= 0) ""
    else s + concatenateN(n - 1, s)

  // 3 -- OOP
  trait Human {
    def statement(): String
  }

  Class Person (name: String, favLanguage: String) {
    def statement(): String = s"Hi, I'm $name and I love $faveLanguage"
  }

  val daniel: Human = new Person("Daniel", "Scala")

  // 4 - pattern matching

  val danielSays = daniel match {
    case Person(name, lang) => s"$name likes $lang"
  }

  // 5 - function as values
  val aFunction = new Function1[Int, Int] {
    override def apply(x: Int) = x + 1
  }

  val three = aFunction(2)
  val aFunction_v2 = (x: Int) => x + 1

  // 6

  def main(args: Array[String]): Unit = {
    println("Hello, Scala")
  }
}
