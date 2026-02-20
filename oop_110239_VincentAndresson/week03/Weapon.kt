package oop_110239_VincentAndresson.week03

class Weapon(val name: String, initialDamage: Int) {

    var damage: Int = initialDamage
        set(value) {
            when {
                // Aturan 1 damage ga boleh negatip
                value < 0 -> {
                    println("Peringatan: Damage gak boleh negatif 🫵💀! Nilai tetap $field.")
                }
                // Aturan 2: Maksimal 1000
                value > 1000 -> {
                    println("Peringatan: Damage terlalu Gacor! Dipaksa jadi 1000 🤺.")
                    field = 1000
                }
                // Jika normal, update nilai field
                else -> {
                    field = value
                }
            }
        }

    // Tier dari weapon
    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}

