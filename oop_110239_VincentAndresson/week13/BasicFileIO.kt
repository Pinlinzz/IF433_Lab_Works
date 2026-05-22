package oop_110239_VincentAndresson.week13

import java.io.File

fun main () {
    println("=== TEST WRITE TEST ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialasasi sistem. \n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")
}