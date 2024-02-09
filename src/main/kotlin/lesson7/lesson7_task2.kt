package lesson7

fun main() {

    do {
        val num = (1000 until 10000).random()
        println("Ваш код авторизации: $num")
        println()
        println("Введите ваш код авторизации: ")
        val userNum = readln().toInt()
    } while (num != userNum)

    println("Добро пожаловать!")

}

