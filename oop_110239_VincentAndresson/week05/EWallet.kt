package oop_110239_VincentAndresson.week05

class EWallet(val balance: Double) {
    override fun processPayment(amount: Double){
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sukses! $accountName berhasil membayar seharga $amount.")
            println("Sisa saldo saat ini: $balance")
        } else {
            println("Gagal: Saldo tidak cukup untuk melakukan pembayaran.")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top-up berhasil! Saldo $accountName bertambah sebesar $amount.")
            println("Total saldo sekarang: $balance")
        } else {
            println("Jumlah top-up harus lebih dari 0.")
        }
    }
}