package oop_110239_VincentAndresson.week03

class Employee(name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}