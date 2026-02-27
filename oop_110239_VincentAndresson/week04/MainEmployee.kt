package oop_110239_VincentAndresson.week04

fun main() {
    // inisiasi Manager
    val managerInfo = Manager("Mr. Gatot", 10000000)

    //inisiasi Developer
    // Parameter: name, baseSalary, programmingLanguage
    val devInfo = Developer("Sir Amba de Sekon", 8000000, "Kotlin")

    println("--- Status Manager ---")
    managerInfo.work()
    // itung bonus: (10% dari 10jt) + 500rb = 1.5jt
    println("Total Bonus ${managerInfo.name}: Rp ${managerInfo.calculateBonus()}")

    println("\n--- Status Developer ---")
    devInfo.work()
    // itung bonus: (10% dari 8jt) = 800rb (karena tidak di-override)
    println("Total Bonus ${devInfo.name}: Rp ${devInfo.calculateBonus()}")
}