package oop_110239_VincentAndresson.week04

// Manager ngewarisin Employee
class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    // Override work() untuk spesialisasi tugas Manager
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    // Override calculateBonus() dengan memanggil logika dasar + tambahan fixed dari bonus
    override fun calculateBonus(): Int {
        val standardBonus = super.calculateBonus()
        val managerAllowance = 500000

        return standardBonus + managerAllowance
    }
}