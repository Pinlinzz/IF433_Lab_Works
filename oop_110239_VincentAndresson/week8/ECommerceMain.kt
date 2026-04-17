package oop_110239_VincentAndresson.week8

// week08: (task) implement payment processing with !!
// week08: (task) batch processing in main
fun main() {
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
