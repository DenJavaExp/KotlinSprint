package lesson11

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

// Создай класс, который будет хранить данные пользователя.
// В свойствах должна храниться информация об
// уникальном идентификаторе,
// логине, пароле и почте. Названием может быть, например, User.
// Создай два экземпляра класса с произвольными данными и выведи в консоль содержимое их полей.
