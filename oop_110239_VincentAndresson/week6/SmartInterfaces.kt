package oop_110239_VincentAndresson.week6

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn() { println("Menyalakan Smart Device") }
    fun turnOff() { println("Mematikan Smart Device") }
}

interface Recordable {
    fun startRecord()
    fun stopRecord() { println("Perekaman dihentikan dan disimpan ke Cloud.")}
}