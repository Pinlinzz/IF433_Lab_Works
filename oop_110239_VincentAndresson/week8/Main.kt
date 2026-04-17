package oop_110239_VincentAndresson.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman : $destination")
}