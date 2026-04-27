package oop_110239_VincentAndresson.week9

fun main() {
    println("=== TEST LIST ===")
    // immutabe list : TIdak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    //frameworks.add("Python") // UNCOMMENT INI BAKAL JADI ERROR!
    println("Immutable List: $frameworks")

    //Mutable List : Bisa ditambah / dikurangi
    val scores : MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List : $scores")

    println("\n=== TEST SET ===") [cite: 29]
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4) [cite: 30]
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat hilang [cite: 31]

    val activeUsers = mutableSetOf("UserA", "UserB") [cite: 32]
    activeUsers.add("UserC") [cite: 33]
    activeUsers.add("UserA") // Diabaikan karena sudah ada [cite: 34]
    println("Active Users: $activeUsers") [cite: 35]

}