package euler

object Problem026 {
  private def lengthOfCycle(n: Int) = {
    if (n % 2 == 0 || n % 5 == 0) 0
    else Iterator.iterate(1) { i =>
      (i * 10) % n
    }.drop(1).takeWhile(_ != 1).length + 1
  }

  def main(args: Array[String]) {
    val answer = (2 until 1000).maxBy(lengthOfCycle)
    println(answer)
  }
}
