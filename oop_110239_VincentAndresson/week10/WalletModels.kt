package oop_110239_VincentAndresson.week10

data class Coin(override val name: String, val balance: Double)
data class Transaction(val id: String, val amount: Double)