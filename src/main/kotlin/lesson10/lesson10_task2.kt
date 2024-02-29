package lesson10

fun main() {
    val userLogin = readln()
    val userPassword = readln()
    val charArreyLogin: CharArray = toCharacterArray(userLogin)
    val charArreyPassword: CharArray = toCharacterArray(userPassword)

    calculateLength(charArreyLogin, charArreyPassword)
}

const val MIN_LENGTH_LOGIN_PASSWORD = 4


fun calculateLength(charArreyLogin: CharArray, charArreyPassword: CharArray) {
    if (charArreyPassword.size > MIN_LENGTH_LOGIN_PASSWORD && charArreyLogin.size > MIN_LENGTH_LOGIN_PASSWORD) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Welcome")
    }
}

fun toCharacterArray(str: String): CharArray {
    return str.toCharArray()
}


