package oop_110239_VincentAndresson.week9

fun main () {
    fun main() {
        val tradeHistory = listOf(
            TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
            TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
            TradeLog("BTCUSDT", "SHORT", 50, 45.0, "CLOSED"),
            TradeLog("SOLUSDT", "LONG", 5, -2.5, "OPEN"),
            TradeLog("ETHUSDT", "LONG", 15, 12.0, "OPEN"),
            TradeLog("DOGEUSDT", "LONG", 10, -10.0, "CLOSED")
        )
        val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

        val winningTrades = closedTrades.filter { it.roe > 0 }

        val losingTrades = closedTrades.filter { it.roe <= 0 }
    }
}