import java.util.concurrent.Future
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

  // 6 - collections
  val aList = List(1, 2, 3)
  val incrementedList = aList.map(x => x + 1) // [2,3,4]
  val transformedList = aList.flatMap(x => List(x, x + 1)) // [1,2,2,3,3,4]
  val evenList = aList.filter(_ % 2 == 0) // [2]
  val chessboard = for {
    num <- List(1, 2, 3)
    char <- List('a', 'b', 'c')
  } yield s"$num-$char"

  // 7 - abstraction, option, try
  val anOption: Option[Int] = Option(42)
  val aTransformedOption = anOption.map(_ + 1)
  val aTry: Try[Int] = Try(throw new RuntimeException)
  val aTransfromedTry = aTry.map(_ * 10)

  // 8 - monads

  // 9 - futures
  import scala.concurrent.ExecutionContext.Implicits.global
  val aFuture: Future[Int] = Future {
    Thread.sleep(1000)
    42
  }
  val aTransformedFuture = aFuture.map(_ * 100)

  def main(args: Array[String]): Unit = {
    println("Hello, Scala")
  }
}
