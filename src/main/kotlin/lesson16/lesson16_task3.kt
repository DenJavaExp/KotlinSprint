class User(
    private val password: String,
) {
    private fun getPassword() = password

    fun checkingPassword(passwordUser: String) {
        return if (getPassword() == passwordUser) {
            println("Пароль введен верно")
        } else {
            println("Вы ввели неверный пароль!")
        }
    }
}

fun main() {
    val user = User("12345password")
    println("Введите пароль:")
    user.checkingPassword(passwordUser = readln())
}
