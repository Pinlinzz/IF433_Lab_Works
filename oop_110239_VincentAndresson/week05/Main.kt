package oop_110239_VincentAndresson.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu siti")

    // Polymorpic Collection : List yang berisi tipe paren, tapi isinya objek anak

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan runtime polymorphic
        pegawai.bekerja()

        //Pegawai.mengajar() INI AKAN ERROR KARENA TIPE REFERNISNYA ADALAH PEGAWAI
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar() // smart cast! tidak perlu manual casting (as)
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------------")
    }


}