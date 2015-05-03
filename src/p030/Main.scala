package p030

object Main {
  private def canBeWrittenAsSumOfNthPowerOfItsDigits(n: Int, exponent: Int) = {
    n == n.toString.map(_.asDigit).map(math.pow(_, exponent).toInt).sum
  }

  def main(args: Array[String]): Unit = {
    val exponent = 5
    val max = 999999

    val answer = (2 to max).filter(canBeWrittenAsSumOfNthPowerOfItsDigits(_, exponent)).sum
    println(answer)
  }
}
