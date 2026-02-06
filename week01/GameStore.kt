package oop_110239_VincentAndreeson.week01

// Diskon : 20% jika harga > 50.000, sisanya 10%
// Output : Tampilkan Judul, Harga Asli, Harga Akhir
// Wajib : Terapkan semua konsep 'Clean Code' yang sudah dipelajari (val, expression, logic, named arguments)

fun main() {
    val price : Int = 890000
    val gameTitle = "BuburLegend"

    val receipt: String? = null

    calculateDiscounted(price)
    printReceipt(
        title = gameTitle,
        price = price,
        finalPrice = calculateDiscounted(price),
        note = receipt
    )
}

fun calculateDiscounted(price: Int): Double = when {
    price > 50000 -> price * 0.8 // Diskon 20%, maka bayar 80%
    else -> price * 0.9          // Diskon 10%, maka bayar 90%
}

fun printReceipt(title: String, price: Int, finalPrice: Double, note: String?) {
    println("=== Invoice Game ===")
    println("Judul        : $title")
    println("Harga Asli   : Rp$price")
    println("Harga Akhir  : Rp$finalPrice")
    println("Catatan      : ${note ?: "Tidak ada catatan"}")
}
