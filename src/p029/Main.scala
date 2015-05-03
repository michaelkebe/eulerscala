package p029

object Main {
  def main(args: Array[String]) {
    val max = 100
    val combinations = for (a <- 2 to max;
                            b <- 2 to max)
      yield BigInt(a).pow(b)
    val answer = combinations.toSet.size
    println(answer)
  }
}
