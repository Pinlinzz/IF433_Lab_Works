package oop_110239_VincentAndresson.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - E-Wallet] Pembayaran sebesar Rp$amount berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName - E-Wallet] Gagal: Saldo tidak cukup (Saldo saat ini: Rp$balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - E-Wallet] Top Up berhasil sebesar Rp$amount. Saldo sekarang: Rp$balance")
    }
}