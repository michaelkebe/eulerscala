package euler

object Problem025 {
  private val fibonacciNumbers = {
    def fibonacci(a: BigInt, b: BigInt): Stream[BigInt] = {
      a #:: fibonacci(b, a + b)
    }
    fibonacci(0, 1)
  }

  def main(args: Array[String]) {
    val answer = Iterator.from(0).find(fibonacciNumbers(_).toString().length == 1000).get
    println(answer)
  }
}
