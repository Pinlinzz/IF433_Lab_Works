package oop_110239_VincentAndresson.week04

// Car "Is-A" vehicle. Parameter "brand: dilempar ke atas memalui Vehicle(brand)

open class Car (brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi Mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat! ")
    }

    override fun acclerate(){
        super.acclerate() // ngemabbil logik penambahan kecepatan milik parent
            // jadi super.methodName() itu buat maggil versi asli dari Parent class
            println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}