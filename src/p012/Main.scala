package p012

import scala.annotation.tailrec

object Main {
  private def nthTriangleNumber(n: Long) = n * (n + 1) / 2

  private def primeFactorsOf(n: Long): List[Long] = {
    @tailrec def loop(factors: List[Long], n: Long): List[Long] = {
      val factor = (2L to math.sqrt(n).toLong).find(n % _ == 0)
      factor match {
        case Some(f) => loop(f :: factors, n / f)
        case None => n :: factors
      }
    }
    loop(List.empty, n)
  }

  private def numberOfDivisors(n: Long): Int = {
    primeFactorsOf(n).groupBy(identity).map(_._2.length + 1).product
  }

  def main(args: Array[String]) {
    val m = Iterator.from(1)
      .map(nthTriangleNumber(_))
      .find(numberOfDivisors(_) > 500).get
    println(m)
  }
}
