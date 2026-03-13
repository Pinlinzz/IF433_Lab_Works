package oop_110239_VincentAndresson.week6

class Gopay : PaymentMethod {
    override fun pay(ammount: Double) {
        println("Processing Rp$ammount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(ammount: Double) {
        println("Contacting Bank for Rp$ammount")
    }
}