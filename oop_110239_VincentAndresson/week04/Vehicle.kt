package oop_110239_VincentAndresson.week04

// gunakan keyword 'open' agar class bisa siwariskan

open class Vehicle(val brand: String){
    var speed: Int = 0

    // Method juga bersifat final secar adefaul. GUnakan 'Open' agar bis di override
    open fun acclerate() {
        seped += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk () {
       println("Beep Beep! ")
    }
}