package oop_110239_VincentAndresson.week6

interface Clickable {
    // ERROR : Property in an interacen cannot have a backing field
    val name: String = "Tombol Rahasia"

    // funct without body (Impicity Abstract)
    fun click()
}