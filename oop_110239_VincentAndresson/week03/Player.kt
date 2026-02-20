package oop_110239_VincentAndresson.week03

class Player(val username: String) {
    private var xp: Int = 0 // diset ke private agar ga nyasar keluar

    val level: Int // ini pake rumus yang ada di modul
        get () = (xp / 100 ) + 1 // (Contoh: XP 0-99 = Level 1, XP 100 = Level 2).

    fun addXp(ammount : Int) {
        if (ammount <= 0) {
            println("Jumlah Xp harus lebih dari 0! 🫵😈")
            return
        }

        val levelSebelumnya = level //nyimpen level lama buat ngetriger levelUp

        xp += ammount
        if(level > levelSebelumnya) {
            println("Level Up! $username naik ke level $level")
        }

        println("Level saat ini ${level}")
    }

    fun displayStatus(){
        println("Player: $username" +
                "Xp: $xp" +
                "Level: $level"
         )
    }

}