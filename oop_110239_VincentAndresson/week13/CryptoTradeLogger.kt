package oop_110239_VincentAndresson.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"


fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) { // Menangkap segala bentuk Exception (NumberFormat/IndexOutOfBounds)
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 150.5),
        TradeRecord(2, "ETHUSDT", "Short", 500.0, -20.0)
    )
    val filePath = "crypto_trades.csv"

    println("=== STARTING LOGGER PIPELINE ===")
    saveTrades(mockTrades, filePath)
    println("Mock data berhasil disimpan.")

    File(filePath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Injeksi baris kotor (DOGE) berhasil ditambahkan untuk testing.\n")
}