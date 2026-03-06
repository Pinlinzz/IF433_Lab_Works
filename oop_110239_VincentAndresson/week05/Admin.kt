package oop_110239_VincentAndresson.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun  bekerja(){
        println("[$nama] sedang duduk di depan komputer melayani administrasi")
    }

    //fungsi unik /spesifik yang hanya dimiliki Admin
    fun doAdminWork() {
        println("[$nama] sedanag merekap data absensi mahasiswa")
    }
}
