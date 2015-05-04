package euler

object Problem017 {
  private val numberToWords: Map[Int, String] = Map(
    1 -> "one", 2 -> "two", 3 -> "three",
    4 -> "four", 5 -> "five", 6 -> "six",
    7 -> "seven", 8 -> "eight", 9 -> "nine",
    10 -> "ten", 11 -> "eleven", 12 -> "twelve",
    13 -> "thirteen", 14 -> "fourteen", 15 -> "fifteen",
    16 -> "sixteen", 17 -> "seventeen", 18 -> "eighteen",
    19 -> "nineteen",
    20 -> "twenty", 30 -> "thirty", 40 -> "forty",
    50 -> "fifty", 60 -> "sixty", 70 -> "seventy",
    80 -> "eighty", 90 -> "ninety")

  private def numberInWords(n: Int): String = {
    if (n >= 1000) {
      "one thousand"
    } else if (n >= 100) {
      val hundreds = n / 100
      val remaining = n - hundreds * 100
      numberInWords(hundreds) + " hundred" + (if (remaining > 0) " and " + numberInWords(n - hundreds * 100) else "")
    } else if (n >= 20) {
      val tens = n / 10
      val remaining = n - tens * 10
      numberToWords(tens * 10) + (if (remaining > 0) "-" + numberInWords(n - tens * 10) else "")
    } else {
      numberToWords(n)
    }
  }

  def main(args: Array[String]) {
    val answer = (1 to 1000).map(numberInWords(_).filter(_.isLetter).length).sum
    println(answer)
  }
}
