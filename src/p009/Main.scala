package p009

object Main {

  def isWantedTriplet(a: Int, b: Int, c: Int) = {
    val isPythagorean = a * a + b * b == c * c
    val sumIs1000 = a + b + c == 1000
    isPythagorean && sumIs1000
  }

  def main(args: Array[String]) {
    val triplets = for (
      a <- 1 to 1000;
      b <- a to 1000;
      c <- b to 1000 if isWantedTriplet(a, b, c)
    ) yield List(a, b, c)
    val answer = triplets.head.product
    println(answer)
  }
}
