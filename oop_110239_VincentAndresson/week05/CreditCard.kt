package oop_110239_VincentAndresson.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - Credit Card] Pembayaran sebesar Rp$amount berhasil. Limit terpakai: Rp$usedAmount / Rp$limit")
        } else {
            println("[$accountName - Credit Card] Transaksi ditolak: Melebihi limit kartu kredit.")
        }
    }
}