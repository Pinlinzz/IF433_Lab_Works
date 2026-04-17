package oop_110239_VincentAndresson.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {
        // BLOCK INI CUMA JALAN KALAU totalPrice tidak null
        price -> val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, dengan Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"


    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf (
        "Smartphone",
        150000,
        UserProfile("Andi", null)
        "Laptop",
        450000.0
    )
}