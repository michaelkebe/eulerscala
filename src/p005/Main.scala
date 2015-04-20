package p005

object Main {
  def main(args: Array[String]) {
    val answer = Iterator.from(1)
      .find(n => (1 to 20).forall(n % _ == 0)).get
    println(answer)
  }
}
