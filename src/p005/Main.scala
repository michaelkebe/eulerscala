package p005

object Main {
  private val divisorsToCheck = 11 to 20
  private def isDivisibleBy1To20(n: Int) = divisorsToCheck.forall(n % _ == 0)

  def main(args: Array[String]) {
    val answer = Iterator.from(start = 20, step = 20)
      .find(isDivisibleBy1To20).get
    println(answer)
  }
}
