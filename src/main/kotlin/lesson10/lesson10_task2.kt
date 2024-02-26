package lesson10

fun main() {
    val userLogin = readln()
    val userPassword = readln()
    check(userPassword, userLogin)
}

fun check(arreyPassword: String, arreyLogin: String) {
    val chArreyLogin: CharArray = toCharacterArray(arreyPassword)
    val chArreyPassword: CharArray = toCharacterArray(arreyLogin)
    if (chArreyPassword.size < 4 && chArreyLogin.size < 4) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Welcome")
    }
}

fun toCharacterArray   (str:String):CharArray{
    return str.toCharArray()
}


