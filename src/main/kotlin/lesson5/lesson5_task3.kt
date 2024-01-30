package lesson5

fun main() {

    println("Угадайте два числа от 0 до 42:")
    val numberOfUser1 = readln().toInt()
    val numberOfUser2 = readln().toInt()
    if ((numberOfUser1 == WINNING_NUMBER_1 || numberOfUser1 == WINNING_NUMBER_2) &&
        (numberOfUser2 == WINNING_NUMBER_1 || numberOfUser2 == WINNING_NUMBER_2)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((numberOfUser1 == WINNING_NUMBER_1 || numberOfUser1 == WINNING_NUMBER_2) ||
        (numberOfUser2 == WINNING_NUMBER_1 || numberOfUser2 == WINNING_NUMBER_2)
    ) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

}

const val WINNING_NUMBER_1 = 7
const val WINNING_NUMBER_2 = 19

