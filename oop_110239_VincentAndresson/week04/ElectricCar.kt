package oop_110239_VincentAndresson.week04

// ElectricCar mewarisi Car (Grandchild dari Vehicle) Vehicle -> Car -> ElectricCar
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int
) : Car(brand, numberOfDoors) {
    /*  disini brand: String itu parameter yg diwarisin dari vehicle,
        kalo number of door itu parameter yang diwarisin dari car,
        kalo batteryCapacity itu parameter baru yang ada di ElectricVehicle
     */

    final override fun acclerate() { //final itu biar agar class keturunan ElectricCar kelak tidak bisa mengubah cara kerjanya.
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")

    }
}