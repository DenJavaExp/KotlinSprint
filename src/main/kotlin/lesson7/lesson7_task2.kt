package lesson7

fun main() {
    var code: Int
    var userCode: Int

    do {
        code = (1000 until 10000).random()
        println("Ваш код авторизации: $code")
        println()
        println("Введите ваш код авторизации: ")
        userCode = readln().toInt()
    } while (code != userCode)

    println("Добро пожаловать!")

}

