package euler

object Problem023 {
  private val limit = 28123

  private def divisorsOf(n: Int) = {
    (1 to n / 2).filter(n % _ == 0)
  }

  private val isAbudantCache: collection.mutable.Map[Int, Boolean] = collection.mutable.Map()

  private def isAbudant(n: Int) = {
    isAbudantCache.getOrElseUpdate(n, divisorsOf(n).sum > n)
  }

  private def canBeWrittenAsSumOfTwoAbudantNumbers(n: Int): Boolean = {
    (1 to n).exists { i =>
      isAbudant(i) && isAbudant(n - i)
    }
  }

  def main(args: Array[String]): Unit = {
    val answer = (1 to limit).filter(!canBeWrittenAsSumOfTwoAbudantNumbers(_)).sum
    println(answer)
  }
}
