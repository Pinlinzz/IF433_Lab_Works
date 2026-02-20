package oop_110239_VincentAndresson.week02

class Loan (
    val bookTitle : String,
    var borrower : String,
    var loanDuration: Int = 1 //default nya 1 hari
)
{
    fun calculateFine(): Int {
        return if (loanDuration > 3) { // kalo pinjem lebih dari 3 hari bayar denda
            (loanDuration - 3) * 2000 // denda 2rb per hari
        } else {
            0
        }
    }

    fun displayBuku() {
        println("\n--- Detail Peminjaman ---")
        println("Judul Buku    : $bookTitle")
        println("Peminjam      : $borrower")
        println("Durasi Pinjam : $loanDuration hari")
        println("Total Denda   : Rp ${calculateFine()}")
        println("-------------------------")
    }
}