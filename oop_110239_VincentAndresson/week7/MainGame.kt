package oop_110239_VincentAndresson.week7

fun main() {
    println("--- UJI COBA SINGLETON ---")
    GameManager.startGame() // Output: Memulai Game Engine...
    GameManager.startGame() // Output: Game sudah berjalan!...

    println("\n--- UJI COBA ENUM & FACTORY ---")
    println("Drop chance item Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val myWeapon = Weapon.forgeStarterSword()
    println("Berhasil forging senjata: ${myWeapon.item.name} (Durability: ${myWeapon.durability})")

    println("\n--- UJI COBA IMMUTABILITY COPY & EVENT EXECUTOR ---")
    val upgradedItem = myWeapon.item.copy(damage = 25, name = "Pedang Kayu Makin OP")

    // Simulasi Event
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}