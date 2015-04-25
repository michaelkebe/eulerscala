package p022

import scala.io.Source

object Main {
  private val names = Source.fromInputStream(
    getClass.getResourceAsStream("p022_names.txt")
  ).mkString.split(",").map(_.filter(_.isLetter))

  private def alphabeticalValue(s: String) = {
    s.map(_.toInt - 'A' + 1).sum
  }

  def main(args: Array[String]): Unit = {
    val answer = names.sorted.zipWithIndex.map { case (name, index) =>
      val position = index + 1
      alphabeticalValue(name) * position
    }.sum
    println(answer)
  }
}
