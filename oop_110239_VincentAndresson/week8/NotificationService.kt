package oop_110239_VincentAndresson.week8

class NotificationService  {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke : $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sednEmail(user.email) // INI BAKAL ERROR : Type mismatch

        if (user.email != null) {
            // SUCCESS via Smart Casst : Compiler thu "user.email" pasti tidak null di bblok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email. ")
        }
    }
}