package oop_110239_ViincentAndresson.week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Object tercipta dengan NIM($nim) yang tidak valid.")
            println("Data Mahasiswa $name mungkin akan bermasalah dalam sistem")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    // Secondary Constructor (Pastikan spelling-nya benar: constructor)
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}