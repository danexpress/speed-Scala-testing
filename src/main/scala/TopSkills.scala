object TopSkills {
  val meaningOfLife = 40 + 2

  // recursion
  def loop(i: Int = 0): Unit = {
    println(i)
    if (i < 10)
      loop(i + 1)
  }

  def main(args: Array[String]): Unit = {
    println("Hello, Scala")
  }
}
