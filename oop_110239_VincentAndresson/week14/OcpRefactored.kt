package oop_110239_VincentAndresson.week14

interface DiscounStrategy {
    fun apply(price: Double) : Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.80
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.85
}