package p007

object Main {
  def isPrime(n: Int) = {
    !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
  }

  def nextPrime(n: Int) = {
    Iterator.from(n + 1).find(isPrime).get
  }

  def main(args: Array[String]) {
    val primes = Iterator.iterate(2)(nextPrime)
    val answer = primes.drop(10000).next()
    println(answer)
  }
}
