package oop_110239_VincentAndresson.week04

// Developer ngewarisin Employee
// nambah paramete  baru 'programmingLanguage' cuma buat di Developer
class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    // Override work() untuk mencetak bahasa pemrograman yang digunakan
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override,
    // sehingga secara otomatis akan menggunakan logika 10% dari Employee.kt
}