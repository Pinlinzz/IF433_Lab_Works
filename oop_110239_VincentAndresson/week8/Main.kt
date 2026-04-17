package oop_110239_VincentAndresson.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BLOCK ===")
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
        UserProfile("Andi", null),
        "Laptop",
        450000.0
    )

    for (item in mixedData) {
        val text = item as? String
        //Hanya cetak jika cast sukses, ie teks tikda null

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100 // Tipe aslinya integer
    // coba cast ke String. Jika gagal (null), ganti dengan "Unknow String"
    val safeString = someObject as? String ?: "Unknow String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTN (!!) ===")
    val toxicData: String? = null
    try {
        //DANGEROUS: ini bakal maksa compiler percaya kalau data tidak null
        val length =  toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }
}



