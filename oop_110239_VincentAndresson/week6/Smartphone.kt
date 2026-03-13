package oop_110239_VincentAndresson.week6

class Smartphone: Camera, Phone {
    // manuallly override to resolve ambiguity

    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn() // Menjalankan logik Phone
        println("Sistem operasi SmartPhone berhaisl booting.")
    }
}