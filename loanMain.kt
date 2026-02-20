package oop_110239_VincentAndresson.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== Library.umn.ac.id ANGJAYY 😎 ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("WARNING: Durasi tidak valid ($duration)🫵.  Diatur default ke 1 hari.")
        duration = 1
    }

    val currentLoan = Loan(title, name, duration)

    currentLoan.displayBuku()
}