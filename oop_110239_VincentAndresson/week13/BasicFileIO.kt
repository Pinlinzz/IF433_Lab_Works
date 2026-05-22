package oop_110239_VincentAndresson.week13

import java.io.File

fun main () {
    println("=== TEST WRITE TEST ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialasasi sistem. \n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")

    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText() // Mengambil seluruh isi file sebagai satu String
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines() // Mengambil per baris sebagai List<String>
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }
}