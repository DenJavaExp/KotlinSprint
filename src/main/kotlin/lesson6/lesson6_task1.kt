package lesson6

fun main() {

    println("Зарегистрируйтесь")
    println("Создайте имя пользователя:")
    val userName = readln()
    println("Создайте пароль ")
    val userPassword = readln()

    do {
        println("Введите имя пользователя и пароль")
    } while (readln() != userName || readln() != userPassword)
    println("Авторизация прошла успешно!")

}



