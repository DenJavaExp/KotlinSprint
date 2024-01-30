package lesson5

fun main() {

    println("Введите ваш год рождения:")
    val userAge = CURRENT_YEAR - readln().toInt()
    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показывать экран со скрытым контентом"
    else "Вернуться на гд=лавный экран"
    println(resultText)

}

const val CURRENT_YEAR = 2024
const val AGE_OF_MAJORITY = 18