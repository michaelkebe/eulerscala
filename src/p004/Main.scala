package p004

object Main {
  def isPalindrome(n: Int) = {
    val s = n.toString
    s.reverse == s
  }

  def main(args: Array[String]) {
    val begin: Int = 100
    val end: Int = 999

    val palindromes = for (
      x <- begin to end;
      y <- begin to end if isPalindrome(x * y)
    ) yield x * y

    val answer = palindromes.max
    println(answer)
  }
}
