class User(
    private val password: String,
) {
    fun checkPassword(passwordUser: String): Boolean {
        return password == passwordUser
    }
}

fun main() {
    val user = User("12345password")

    println("Введите пароль:")
    println(user.checkPassword(passwordUser = readln()))
}
