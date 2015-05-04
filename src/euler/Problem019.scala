package euler

import java.time.{DayOfWeek, LocalDate, Month}

object Problem019 {
  def main(args: Array[String]): Unit = {
    val firstDaysOfMonth = for (
      year <- 1901 to 2000;
      month <- Month.values()
    ) yield LocalDate.of(year, month, 1)

    val answer = firstDaysOfMonth.count(_.getDayOfWeek == DayOfWeek.SUNDAY)
    println(answer)
  }
}
