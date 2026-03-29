package oop_110239_VincentAndresson.week7

class NetworkClient private constructor(val url : String) {
    fun connect() {
        println("Connecting to $url...")
    }
}