package lesson6

fun main() {
    val check = 1
    while (check > 0) {
        println("Введите количество секунд работы программы")
        var userSeconds = readln().toInt()

        while (userSeconds > 0) {
            println("Осталось секунд: " + userSeconds--)
            Thread.sleep(1000)
        }
        println("Время вышло")
    }
}

