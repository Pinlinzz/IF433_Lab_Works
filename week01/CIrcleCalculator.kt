package oop_110239_VincentAndreeson.week01

fun main (args: Array<String>){
    // variable definition

    val radius = 7.0 //diubah yang awalnya var jadi val
    val pi  = 3.14

    //Calculation
    val area = pi * radius * radius

    // Output Concantetaion
    //println("Radius: " + $radius + ", Area: " + $area)
    println("Radius: $radius, Area: $area")

    //Logic Check
    checkSize(area)
    println("Circle Size: ${checkSize(area)}")
}

// ubah function checkSize ngebalikin string, bkan ngeprint
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

/*fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}
 */

