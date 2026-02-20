package oop_110239_VincentAndresson.week03

class Employee(name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: GAJI TIDAK BOLEH NEGATIF! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}

private var performanceRating: Int = 3

fun increasePerformance() {
    performanceRating++
    println("Kinerja $name meningkat! Rating: $performanceRating")
}

fun printStatus() {
    println("Karyawan $name, Rating: $performanceRating")
}