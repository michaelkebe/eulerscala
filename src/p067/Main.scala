package p067

import scala.io.Source

object Main {

  private val triangle = parseTriangleString(
    Source.fromInputStream(
      getClass.getResourceAsStream("p067_triangle.txt")
    ).mkString
  )

  def parseTriangleString(s: String) = {
    s.stripMargin.split(util.Properties.lineSeparator)
      .map(_.split(" ").map(_.toInt).toList).toList
  }

  def main(args: Array[String]) {
    val answer = triangle.reduceRight { (top, bottom) =>
      val maxOfNeighbourPair = bottom.sliding(2).map(_.max).toList
      top.zip(maxOfNeighbourPair).map { case (t, b) => t + b }
    }.head
    println(answer)
  }
}
