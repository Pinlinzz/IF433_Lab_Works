package oop_110239_VincentAndresson.week04

//'open' dipake agar class ini bisa diwariskan ke posisi seperti Manager atau Developer
open class Employee(val name: String, val baseSalary: Int) {

    open fun work() { // work bisa diwarisin
        println("$name sedang bekerja.")
    }

    // Method untuk menghitung bonus 10% dari baseSalary
    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}