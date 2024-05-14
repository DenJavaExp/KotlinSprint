package lesson10

fun main() {
    println("Придумайте логин который должен содержать минимум 4 символа:")
    val userLogin = readln()

    println("Придумайте пароль который должен содержать минимум 4 символа:")
    val userPassword = readln()

    calculateLength(userLogin, userPassword)
}

const val MIN_LENGTH_LOGIN_PASSWORD = 4

fun calculateLength(
    userLogin: String,
    userPassword: String,
) {
    if (userLogin.length < MIN_LENGTH_LOGIN_PASSWORD || userPassword.length < MIN_LENGTH_LOGIN_PASSWORD) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Welcome")
    }
}
