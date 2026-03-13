package oop_110239_VincentAndresson.week6

//Menggabungkan 1 Parent Class dan 2 Interfaces

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP d sekitar untuk pairing ...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W. ")
    }
}

