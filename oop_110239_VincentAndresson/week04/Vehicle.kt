package oop_110239_VincentAndresson.week04

// gunakan keyword 'open' agar class bisa diwariskan

open class Vehicle(val brand: String){
    var speed: Int = 0

    // Method juga bersifat final secara default. GUnakan 'Open' agar bis di override
    open fun acclerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk () {
       println("Beep Beep! ")
    }
}