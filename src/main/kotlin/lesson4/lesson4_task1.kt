package lesson4

fun main() {

    val reservedBookedToday = 13
    val reservedBookedTomorrow = 4

    println(
        "Доступность столиков на сегодня: ${reservedBookedToday < NUMBER_OF_TABLES } " +
                "\nДоступность столиков на завтра: ${reservedBookedTomorrow < NUMBER_OF_TABLES}"
    )

}

const val NUMBER_OF_TABLES = 13

