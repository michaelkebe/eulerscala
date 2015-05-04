package euler

object Problem020 {
  private def factorial(n: Int) = {
    (BigInt(1) to n).product
  }

  def main(args: Array[String]) {
    val answer = factorial(100).toString().map(_.asDigit).sum
    println(answer)
  }
}
