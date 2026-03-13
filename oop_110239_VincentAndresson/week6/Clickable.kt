package oop_110239_VincentAndresson.week6

interface Clickable {
    val name : String // Abstrack property, tidak ada nilai default
    fun click()
}

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik")
    }
}