package oop_110239_VincentAndresson.week10

fun main() {
    println("=== DASHBOARD CRYPTO WALLET ===")
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.05))
    coinRepo.add(Coin("ETH", 1.2))
    coinRepo.add(Coin("USDT", 500.0))

    println("\n[UJI PENCARIAN]")
    val searchResult = coinRepo.searchByName("ETH")
    println("Hasil cari 'ETH': $searchResult")

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("\n[DATA KOIN - STATUS API: ${response.status}]")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Saldo: ${coin.balance}")
    }
}