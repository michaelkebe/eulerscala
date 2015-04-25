package p021

object Main {
  def divisorsOf(n: Int) = {
    (1 to n / 2).filter(n % _ == 0)
  }

  def isAmicable(n: Int) = {
    val sumOfDivisors = divisorsOf(n).sum
    n != sumOfDivisors && divisorsOf(sumOfDivisors).sum == n
  }

  def main(args: Array[String]): Unit = {
    val answer = (1 until 10000).filter(isAmicable).sum
    println(answer)
  }
}
