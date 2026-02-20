package oop_110239_ViincentAndresson.week02


import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("Masukan Nama: ")
    val name = scanner.nextLine()

    println("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() //consume Newline

    if(type == 1){
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()
        //Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftardi ${s1.major} dengna GPA awal ${s1.gpa}")
    }

    else if (type == 2){
        //memanggil Secondary Construcor, jruusan otomatis "Non-Matricurated"
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan Ngawur, pendaftaran BATAL! 💀💀")
    }

    scanner.nextLine() //Bersihkan buffer newline (Penyakit klasik scanner)

    if(nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter")
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