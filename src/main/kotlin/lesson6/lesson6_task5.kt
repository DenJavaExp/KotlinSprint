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

    var check = 3
    while (check > 0) {
        val num = (1..9).random()
        val num2 = (1..9).random()
        println("Докажите что вы не робат: $num + $num2")
        val correctDecision = num + num2
        val decision = readln().toInt()
        check--

        if (correctDecision == decision) {
            println("Авторизация прошла успешно!")
            break
        } else {
            println("Введен неверный ответ!")
            if (check == 0) {
                println("Превышен лимит попыток входа, ваш акаунт заблокирован!")
            }
        }
    }
}


