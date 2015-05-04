package euler

object Problem014 {
  private def collatzSequenceIterator(n: Long): Iterator[Long] = {
    Iterator.iterate(n){k =>
      if (k % 2 == 0) k / 2
      else 3 * k + 1
    }.takeWhile(_ != 1)
  }

  def main(args: Array[String]): Unit = {
    val answer = (1L until 1000000L).maxBy(collatzSequenceIterator(_).length)
    println(answer)
  }
}
