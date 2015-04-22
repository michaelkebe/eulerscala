package p016

object Main {
  private def sumOfDigits(n: BigInt) = {
    n.toString().map(_.toString.toInt).sum
  }

  def main(args: Array[String]): Unit = {
    val answer = sumOfDigits(BigInt(2).pow(1000))
    println(answer)
  }
}
