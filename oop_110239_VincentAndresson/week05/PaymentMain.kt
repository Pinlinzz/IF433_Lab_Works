package oop_110239_VincentAndresson.week05

fun main() {
    // Inisiasi objek
    val myWallet = EWallet("Budi", 50000.0)
    val myCard = CreditCard("Budi", 100000.0)

    // Masukin ke dalem list PaymentMethod (Polymorphism)
    val payments: List<PaymentMethod> = listOf(myWallet, myCard)

    val tagihan = 75000.0

    for (payment in payments) {
        println("--- Memproses pembayaran untuk: ${payment.accountName} ---")

        // Testing payment pertama
        payment.processPayment(tagihan)

        // Smart Casting
        if (payment is EWallet) {
            println("Mendeteksi E-Wallet... Mencoba Top Up otomatis.")
            payment.topUp(50000.0)

            println("Mencoba memproses pembayaran ulang...")
            payment.processPayment(tagihan)
        }

        println()
    }
}