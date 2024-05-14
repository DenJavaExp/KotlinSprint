package lesson11

class User(
    var id: Int,
    var login: String,
    var password: String,
    var mail: String,
)

fun main() {
    val user1 =
        User(
            id = 111,
            login = "Denis",
            password = "1@3$",
            mail = "denis@mail.ru",
        )

    val user2 =
        User(
            id = 112,
            login = "Nikita",
            password = "2#4%",
            mail = "nikita@mail.ru",
        )

    println("ID пользавателя ${user1.id}")
    println("login пользователя${user1.login}")
    println("пароль пользователя ${user1.password}")
    println("mail пользователя ${user1.mail}")
    println()
    println("ID пользавателя ${user2.id}")
    println("login пользователя${user2.login}")
    println("пароль пользователя ${user2.password}")
    println("mail пользователя ${user2.mail}")
}
