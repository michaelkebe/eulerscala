package euler

object Problem028 {
  private def sumOfDiagonalsInSpiralWithWidth(width: Int) = {
    def loop(cornerValue: Int, edgeLength: Int, sum: Int, cornerCount: Int, maxLength: Int): Int = {
      if (edgeLength > maxLength)
        sum
      else {
        val nextCornerValue = cornerValue + edgeLength
        if (cornerCount == 4)
          loop(nextCornerValue, edgeLength + 2, sum + nextCornerValue, 1, maxLength)
        else
          loop(nextCornerValue, edgeLength, sum + nextCornerValue, cornerCount + 1, maxLength)
      }
    }
    loop(1, 2, 1, 1, width)
  }

  def main(args: Array[String]): Unit = {
    val answer = sumOfDiagonalsInSpiralWithWidth(1001)
    println(answer)
  }
}
