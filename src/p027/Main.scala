package p027

object Main {

  case class QuadraticFunction(a: BigInt, b: BigInt) {
    def apply(n: BigInt) = {
      n.pow(2) + (a * n) + b
    }
  }

  def consecutivePrimes(qf: QuadraticFunction) = {
    Iterator.from(0).takeWhile(qf(_).isProbablePrime(100)).length
  }

  def main(args: Array[String]): Unit = {
    val quadraticFunctions = for (a <- -999 to 999;
                                  b <- -999 to 999)
      yield new QuadraticFunction(a, b)

    val qf = quadraticFunctions.maxBy(consecutivePrimes)

    val answer = qf.a * qf.b
    println(answer)
  }
}
