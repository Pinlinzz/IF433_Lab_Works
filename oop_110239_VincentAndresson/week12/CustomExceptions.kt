package oop_110239_VincentAndresson.week12

// Custom exceptiond dengan mmebawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")