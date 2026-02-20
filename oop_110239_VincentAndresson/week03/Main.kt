package oop_110239_VincentAndresson.week03

fun main() {
    val e = Employee("Budi")
    // println("---Test Error---") // INI BUAT TEST ERROR
    // e.salary = 5000 // ini akan meledakan program anda

    // 1. test validasi salary
    e.salary = -1000 // Harunsya ini bakal jadi error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test Encapsulation
    e.increasePerformance()
    //e.performanceRating = 5 // kalau di uncomment harusnya nya merah, karna ini tuh private 🫵

    println("Pajak yang harus dibayar: ${e.tax}")
}