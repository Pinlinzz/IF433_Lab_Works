package oop_110239_VincentAndresson.week7

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Pak Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang Keadilan Papa Zola 🤺", 120, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}