package oop_110239_VincentAndresson.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}