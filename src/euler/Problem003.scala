package euler

object Problem003 {
  private def primeFactorsOf(n: Long): List[Long] = {
    val factor = (2L to math.sqrt(n).toLong).find(n % _ == 0)
    factor match {
      case Some(x) => x :: primeFactorsOf(n / x)
      case None => List(n)
    }
  }

  def main(args: Array[String]) {
    val answer = primeFactorsOf(600851475143L).max
    println(answer)
  }
}
