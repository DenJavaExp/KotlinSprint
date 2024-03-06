package lesson11

class User2(
    var id: Int,
    var login: String,
    var password: String,
    var mail: String,
    var bio: String?,
)

fun printInfo(
    id: Int,
    login: String,
    password: String,
    mail: String,
) {
    println(
        "id пользователя $id\nlogin пользователя $login\npassword пользователя $password\nmail пользователя $mail ",
    )
}

fun requestBio(): String {
    return readln()
}

fun changingPassword(oldPassword: String): String {
    println("Введите старый пароль: ")
    val userPassword = readln()
    val newPassword: String

    return if (userPassword == oldPassword) {
        println("Создайте новй пароль: ")
        newPassword = readln()
        println("Пароль изменен")
        newPassword
    } else {
        println("Старый пароль введен не верно")
        oldPassword
    }
}

fun main() {
    val user1 =
        User2(
            id = 111,
            login = "Denis",
            password = "1@3$",
            mail = "denis@mail.ru",
            bio = null,
        )

    printInfo(user1.id, user1.login, user1.password, user1.mail)

    println()
    println("Введите ваше состояние здоровья:")
    user1.bio = requestBio()
    println("Статус bio: ${user1.bio}")

    println()
    user1.password = changingPassword(user1.password)

    println()
    printInfo(user1.id, user1.login, user1.password, user1.mail)
}
