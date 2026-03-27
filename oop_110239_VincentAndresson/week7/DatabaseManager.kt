package oop_110239_VincentAndresson.week7

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect () {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}