package oop_110239_VincentAndresson.week7

fun main() {
    //val client = NetworkClient("https://api.umn.ac.id") // ini error karena constructornya masih private


    println("=== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //Instansiasi lewat factor
    client.connect()
}