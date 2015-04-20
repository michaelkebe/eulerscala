package p003

object Main {
  def primeFactorsOf(n: Long): List[Long] = {
    val foobar = (2L to math.sqrt(n).toLong).find(n % _ == 0)
    foobar match {
      case Some(x) => x :: primeFactorsOf(n / x)
      case None => List(n)
    }
  }

  def main(args: Array[String]) {
    val answer = primeFactorsOf(600851475143L).max
    println(answer)
  }
}
