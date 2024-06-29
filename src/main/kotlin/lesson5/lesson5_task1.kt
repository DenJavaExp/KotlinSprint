package lesson5

const val RESULT = 5
const val NUM1 = 3
const val NUM2 = 2

fun main() {
    println("Чему равно дпнное выражение $NUM1 + $NUM2 = ")
    val answer = readln().toInt()
    if (answer == RESULT) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
