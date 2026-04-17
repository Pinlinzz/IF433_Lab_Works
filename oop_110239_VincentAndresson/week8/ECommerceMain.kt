package oop_110239_VincentAndresson.week8

// week08: (task) implement payment processing with !!
// week08: (task) batch processing in main
fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // corrupted
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // missing ID
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // unknown type
    )

   val parser = ApiParser()
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Warning: Corrupted data -> ${e.message}")
        }
    }
}
