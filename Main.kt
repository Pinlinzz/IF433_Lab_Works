package oop_110239_VincentAndresson.week02


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("Masukan Nama: ")
    val name = scanner.nextLine()

    println("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() //Bersihkan buffer newline (Penyakit klasik scanner)

    if(nim.length != 5){
        println("ERROR: p+Pendaftaran dibatalkan. NIM harus 5 karakter")
        //Program berhenti di sini utnuk mahasiswa ini, tidk membuat objek baru
    }
    else {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        // Instasi Obejct karena dat sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendafaran Selesai")
    }
}