package oop_110239_VincentAndresson.week05

abstract class PaymentMethod (val accountName: String){
    abstract fun processPayment(amount: Double)
}

