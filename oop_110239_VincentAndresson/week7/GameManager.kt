package oop_110239_VincentAndresson.week7

object GameManager {
   var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! ")
        } else {
            isGameRunning = true
            println("Memulai Game Engine... ")
        }
    }
}