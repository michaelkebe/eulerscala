package p006

object Main {
  def main(args: Array[String]) {
    val numbers = 1 to 100

    val sumOfSquares = numbers.map(n => n * n).sum

    val sumOfNumbers = numbers.sum
    val squareOfSum = sumOfNumbers * sumOfNumbers

    val answer = squareOfSum - sumOfSquares
    println(answer)
  }
}
