package p010

object Main {
  def isPrime(n: Long) = {
    !(2L to math.sqrt(n).toLong).exists(n % _ == 0)
  }
  
  def nextPrime(n: Long) = {
    Iterator.iterate(n + 1L)(_ + 1L).find(isPrime).get
  }
  
  def main(args: Array[String]) {
    val primes = Iterator.iterate(2L)(nextPrime)
    val answer = primes.takeWhile(_ < 2000000).sum
    println(answer)
  }
}
