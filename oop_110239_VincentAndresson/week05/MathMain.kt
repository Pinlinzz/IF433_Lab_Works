package oop_110239_VincentAndresson.week05

fun main() {
    val helper = MathHelper()

    // Memanggil hitungLuas(sisi: Int)
    val luasPersegi = helper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    // Memanggil hitungLuas(panjang: Int, lebar: Int)
    val luasPersegiPanjang = helper.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")

    // Memanggil hitungLuas(jariJari: Double)
    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}