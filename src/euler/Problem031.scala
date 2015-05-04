package euler

object Problem031 {
  private def numberOfPossibleExchanges(coins: List[Int], amount: Int): Int = coins match {
    case smallestCoin :: remainingCoins =>
      if (smallestCoin > amount) 0
      else if (smallestCoin == amount) 1
      else numberOfPossibleExchanges(coins, amount - smallestCoin) +
        numberOfPossibleExchanges(remainingCoins, amount)
    case _ => 0
  }

  def main(args: Array[String]): Unit = {
    val answer = numberOfPossibleExchanges(List(1, 2, 5, 10, 20, 50, 100, 200), 200)
    println(answer)
  }
}
