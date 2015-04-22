package p014

object Main {
  def collatzSequence(n: Long): Stream[Long] = {
    n #:: {
      if (n == 1) Stream.Empty
      else if (n % 2 == 0) collatzSequence(n / 2)
      else collatzSequence(3 * n + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val answer = (1L until 1000000L).maxBy(collatzSequence(_).length)
    println(answer)
  }
}
