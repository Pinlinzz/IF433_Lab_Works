package oop_110239_VincentAndreeson.week01

fun main () {
    //REFATOR: GUNAKAN Val dan hapus tipe data eksplisit
    var name = "John Thor"
    var score = 80

    // Concatenation  gaya lama
    //println("Nama: " + name + ", Nilai: " + score)

    // REFACTOR : String Template ($name)
    println("Nama: $name, Nilai: $score")

}
