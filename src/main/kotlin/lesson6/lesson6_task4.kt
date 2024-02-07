package lesson6

fun main() {
    var attempts = 5
    val num = (1..9).random()

    while (attempts > 0) {
        println("Угадайте число от 1 до 9:")
        val userNum = readln().toInt()
        if (userNum == num) {
            println("Это была великолепная игра!")
            break
        } else {
            attempts--
            println("Неверно! осталось  $attempts попыток")
        }
    }
    println("Было загадано число $num")
}









