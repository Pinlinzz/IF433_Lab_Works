package oop_110239_VincentAndresson.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Kaki 3")
    generalVehicle.honk()
    generalVehicle.acclerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Tayo", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.acclerate()

    println("\n--- Testing ElectricCar---")
    val electricCar = ElectricCar("BeYeDe", 4, batteryCapacity = 100)
    electricCar.openTrunk()
    electricCar.acclerate()
}

