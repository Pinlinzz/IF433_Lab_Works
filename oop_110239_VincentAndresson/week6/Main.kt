package oop_110239_VincentAndresson.week6

import jdk.jfr.DataAmount

// Fungsi ini Decoupled! tidak peduli kelas alsiny apa

fun processCheckout(method: PaymentMethod, amount: Double) {
    println(" --> Memulai Checkout....")
    method.pay(amount) // DYnamic polymorphism in action
}

fun main () {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}