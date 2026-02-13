package oop_110239_VincentAndresson.week02

class Student (
    val name : String,
    val nim : String,
    val major : String
) {
    init {
        // Validasi Sederhana : Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Object tercipta dengan NIM($nim) yang tidak valid.")
            println("Data Mahasiswa $name mungkin akan  bermasalah dengan sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasiskan di Memory.")
        }

    }
}