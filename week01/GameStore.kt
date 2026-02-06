package oop_110239_VincentAndreeson.week01

// Diskon : 20% jika harga > 50.000, sisanya 10%
// Output : Tampilkan Judul, Harga Asli, Harga Akhir
// Wajib : Terapkan semua konsep 'Clean Code' yang sudah dipelajari (val, expression, logic, named arguments)

fun main() {
    val price : Int = 890000
    val gameTitle = "BuburLegend"

    calculateDiscounted(price)
}

fun calculateDiscounted(price: Int): Double = when {
    price > 50000 -> price * 0.8 // Diskon 20%, maka bayar 80%
    else -> price * 0.9          // Diskon 10%, maka bayar 90%
}

