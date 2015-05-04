package euler

object Problem016 {
  private def sumOfDigits(n: BigInt) = {
    n.toString().map(_.asDigit).sum
  }

  def main(args: Array[String]): Unit = {
    val answer = sumOfDigits(BigInt(2).pow(1000))
    println(answer)
  }
}
