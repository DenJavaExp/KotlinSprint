package lesson5

fun main() {

    println("Чему равно дпнное выражение 3 + 2 = ")
    val answer = readln().toInt()
    if (answer == RESULT) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}

const val RESULT = 5
