package euler

object Problem024 {
  def main(args: Array[String]) {
    val answer = "0123456789".permutations.drop(1000000 - 1).next()
    println(answer)
  }
}
