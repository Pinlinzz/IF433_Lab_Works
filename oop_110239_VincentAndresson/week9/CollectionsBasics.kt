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
}