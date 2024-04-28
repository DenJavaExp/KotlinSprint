class User(
    private val password: String = "12345password",
) {
    private fun getUser() = password

    fun checkingPassword(passwordUser: String) {
        return if (getUser() == passwordUser) {
            println("Пароль введен верно")
        } else {
            println("Вы ввели неверный пароль!")
        }
    }
}

fun main() {
    val user = User()
    println("Введите пароль:")
    user.checkingPassword(passwordUser = readln())
}
