package lesson6

fun main() {
    var userSeconds = readln().toLong()

    while (userSeconds > 0) {
        println("Осталось секунд: $userSeconds")
        userSeconds--
        Thread.sleep(1000)
    }
    println("Время вышло")
}





