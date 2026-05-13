package oop_110239_VincentAndresson.week10

fun main() {
    println("=== DASHBOARD CRYPTO WALLET ===")
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.05))
    coinRepo.add(Coin("ETH", 1.2))
    coinRepo.add(Coin("USDT", 500.0))

    // Uji coba fungsi pencarian dari Checkpoint 14
    println("\n[UJI PENCARIAN]")
    val searchResult = coinRepo.searchByName("ETH")
    println("Hasil cari 'ETH': $searchResult")
}