package p002

object Main {
  def fibonacci(a: Int, b: Int): Stream[Int] = {
    a #:: fibonacci(b, a + b)
  }

  def main(args: Array[String]) {
    val fibonacciNumbers = fibonacci(1, 2)
    val answer = fibonacciNumbers
      .takeWhile(_ < 4000000)
      .filter(_ % 2 == 0)
      .sum
    println(answer)
  }
}

