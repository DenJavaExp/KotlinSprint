package lesson7

fun main() {

    println("Введите число: ")
    val userNum = readln().toInt()
    for (i in 0..userNum) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

