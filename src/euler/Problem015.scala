package euler

object Problem015 {
  private def factorial(n: Int) = {
    (BigInt(1) to n).product
  }

  def main(args: Array[String]) {
    val gridLength = 20
    val answer = factorial(gridLength * 2) / (factorial(gridLength) * factorial(gridLength))
    println(answer)
  }
}
