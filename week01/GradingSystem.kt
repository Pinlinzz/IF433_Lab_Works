package oop_110239_VincentAndreeson.week01

fun main () {
    //REFATOR: GUNAKAN Val dan hapus tipe data eksplisit
    var name = "John Thor"
    var score = 80

    // Concatenation  gaya lama
    //println("Nama: " + name + ", Nilai: " + score)

    // REFACTOR : String Template ($name)
    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90.. 100 -> "A"
        in 80.. 89 -> "B"
        in 70.. 79 -> "C"
        else -> "D"
    }
    println("Grade Kau : $grade")
    println("Status: ${calcultedStatus(score)}")

    // Tambah di akhir main()
    val studentId : String? = null
    // Jika null, gunakan nili defailt 0
    val idLength = studentId?.length ?: 0
    println("Panjang Id: $idLength")
}

// Tulis DI LUAR main()
fun calcultedStatus(score : Int) = if (score > 75) "Lulus" else "Tidak Lulus"

