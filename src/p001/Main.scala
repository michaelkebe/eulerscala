package p001

object Main {
  def isDivisibleByThreeAndFive(n: Int) = n % 3 == 0 || n % 5 == 0

  def main (args: Array[String]) {
    val answer = (1 until 1000)
      .filter(isDivisibleByThreeAndFive)
      .sum
    println(answer)
  }
}

