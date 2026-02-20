package oop_110239_VincentAndresson.week03

fun main() {

    val myWeapon = Weapon("Puding Coklat Pak Hambali 🙀", 30)
    println("Nama: ${myWeapon.name} Damage: ${myWeapon.damage}")
    println("----------------------------------------------")

    // 1. Coba set damage ke -50 (Harus Gagal)
    println("Mencoba set damage ke -50...")
    myWeapon.damage = -50
    println("Damage saat ini: ${myWeapon.damage}") // Nilai harus tetap 100
    println("----------------------------------------------")

    // 2. Coba set damage ke 9999 (Harus dipaksa jadi 1000)
    println("Mencoba set damage ke 9999...")
    myWeapon.damage = 9999
    println("Damage saat ini: ${myWeapon.damage}") // Nilai harus menjadi 1000
    println("----------------------------------------------")

    // 3. Print Tier-nya
    // Karena damage sekarang 1000 (> 800), tier harus "Legendary"
    println("Hasil Akhir:")
    println("Nama Senjata : ${myWeapon.name}")
    println("Final Damage : ${myWeapon.damage}")
    println("Tier Senjata : ${myWeapon.tier}")

    println("---------------------------------------------")
    println("------ INISIASI PLAYER ------")
    // ------ INISIASI PLAYER ------

    val player = Player("Mas Gatot")

    println("Status Awal Player:")
    println("Username : ${player.username}")
    println("Level    : ${player.level}")
    println("----------------------------------------------")

    // Testing 50Xp
    println("Menambahkan 50Xp")
    player.addXp(50)

    // Testing -50Xp
    println("Menambahkan -50Xp")
    player.addXp(-50)

    // addXp(60)
    println("Menambah 60 XP...")
    player.addXp(60)

    println("----------------------------------------------")
    println("Status Akhir Player:")
    println("Level Sekarang: ${player.level}")


}