package oop_110239_VincentAndresson.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("Status: Berada di safe zone. Kamu bisa istirahat.")
        }
        is BattleState.MonsterEncounter -> {

            println("HATI HATI! Kamu diserang ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val loot = event.item
            println("ANJAYY! Kamu dapat  loot baru: ${loot.name} (Rarity: ${loot.rarity}, Damage: ${loot.damage})")
        }
        is BattleState.GameOver -> {
            println("GAME OVER! Karna ${event.reason}")
        }
    }
}