package oop_110239_VincentAndresson.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. Input Data Hero
    println("=== WELCOME TO NGAWI RPG 🫵😎 ===")
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val heroDamage = scanner.nextInt()

    // Buat Objek Hero (HP default 100 otomatis masuk)
    val myHero = Hero(heroName, heroDamage)

    // 2. Variabel Musuh
    var enemyHp = 100
    val enemyName = "Mas Rusdi"

    println("\nSeekor $enemyName muncul! Takuddnyoooo 😱😱!")

    // 3. Looping Battle
    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- STATUS ---")
        println("${myHero.name} HP: ${myHero.hp} | $enemyName HP: $enemyHp")
        println("Menu: ")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            // hero attack
            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP $enemyName: $enemyHp")

            // Musuh ngebales (kalau masih hidup)
            if (enemyHp > 0) {
                val monsterDamage = (10..20).random()
                println("\n$enemyName membalas serangan!")
                myHero.takeDamage(monsterDamage)
            }
        }
        else if (choice == 2) {
            // Kabur
            println("Kamu melarikan diri dari pertempuran... Penakut ( himel kecewa beraat)!")
            break
        }
        else {
            println("Pilihan tidak valid! Kamu bengon dan melewatkan giliran.")
        }
    }

    // 4 Pengumuman menang / kalah
    println("\n============================")
    if (!myHero.isAlive()) {
        println("GAME OVER: ${myHero.name} telah gugur di medan perang.")
    } else if (enemyHp <= 0) {
        println("VICTORY: $enemyName berhasil dikalahkan! ${myHero.name} menang!")
    } else {
        println("BATTLE ENDED: Kamu berhasil melarikan diri.")
    }
    println("============================")
}