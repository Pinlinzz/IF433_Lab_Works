package oop_110239_VincentAndresson.week14

// TUJUNANNYA NGECEGAK MODIFIKASI CLASS YANG SUDAH BERJALAN KETIKA ADA PENAMBAHAN FITUR BARU

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.85
            "employee" -> price * 0.70
            // Setiap ada diskon baru (misal: senior/VIP), class ini harus dimodifikasi!
            else -> price
        }
    }
}

