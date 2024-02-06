package lesson6

fun main() {
    val userSeconds = readln().toLong()

    Thread.sleep(1000 * userSeconds)
    println("Прошло $userSeconds секунд")
}


