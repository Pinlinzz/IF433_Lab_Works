package oop_110239_VincentAndresson.week02

class Hero (
    val name : String,
    var hp : Int =  100, //defaultnya disetel ke 100
    var baseDamage : Int
) {
    fun attack(targetName: String) {
        println(">> $name menyerang $targetName dengan damage $baseDamage!")
    }

    fun takeDamage(damage: Int) {
        this.hp -= damage

        if (this.hp <= 0) { // ngeset bisa darahnay tuh dilimit ke 0, biar ga mines
            this.hp = 0
        }

        println("$name menerima damage. Hp Tersisa: ${this.hp}")
    }

    fun isAlive(): Boolean {
        return this.hp > 0
    }
}