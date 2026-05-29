package oop_110239_VincentAndresson.week14

data class User(val name: String, val email: String, val age: Int)

class UserManager {
    //BUSINESS LOGIC
    fun validateUser(user: User) : Boolean{
        return user.email.contains("@") && user.age >= 18
    }

    //DATABASE ACCESS
    fun saveUserToDatabase(user: User) {
        println("INSERT INTO users VALUES  ('${user.name}', '${user.email}') ")
    }

    // EMAIL NOTIFICATION
    fun sendWelcomeEmail (user: User) {
        println("Sending email to: ${user.email}")
    }
}

