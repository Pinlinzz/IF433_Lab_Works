package oop_110239_VincentAndresson.week7

fun main() {
    //val client = NetworkClient("https://api.umn.ac.id") // ini error karena constructornya masih private


    println("=== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //Instansiasi lewat factor
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUSer("Alice", 22)
    val reg2 = RegularUSer("Alice", 22)
    println(reg1) // bakal menceetak memori hash
    println("Sama? ${reg1 == reg2}") // outputnya bakal false

    println("\n=== TEST DATA CLASS ===")
    val data1 = RegularUSer("Alice", 22)
    val data2 = RegularUSer("Alice", 22)
    println(data1) // otomatis jadi readable format
    println("Sama? ${data1 == data2}") // outputnya bakal jadi true

    println("\n=== TESTING IMMUTABILITY & DESTUCTURING === ")
    val data3 = data1.copy(age = 33)
    println("Hasil Copy : $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")
}