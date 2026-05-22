package oop_110239_VincentAndresson.week13

fun main () {
    println("=== TEST UNSAFE RESOUCCE HANDLING ===")
    val unsafeFile = File("unsafe_log.txt")
    // membuaka stream secara manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // BAHAYA: Jika terjadi exeption di baris ini (misalnya pembagian dengan nol atau error tak terduga).
    // program akan crash dan emtode write.close( di bawahnya TIDAK AKAN PERNAH TEREKSEKUSI
    // file akan terus terkunci oleh OS

    // Wajib dipanggil secara mmanual jika tidak memakai blok 'use'
    writer.close()
    println("Proses penulisan usafe selesai.")
}