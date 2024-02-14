package lesson7

fun main() {
    println("Сколько хотите засечь секунд: ")
    val secondUser = readln().toInt()

    for (i in 0..secondUser) {
        Thread.sleep(1000)
        println("$i ${secondUser - i}")
    }
    println("Время вышло")
}

