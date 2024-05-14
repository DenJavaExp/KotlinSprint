class UserData(name: String, password: String) {
    var name: String = name
        set(value) {
            field = value
            println("Имя пользоваеля успешно изменено")
        }
    var password: String = password
        get() {
            val count = field.length
            val str = "*".repeat(count)
            return str
        }
        set(value) {
            println("Вы не можете изменит пароль")
        }
}

fun main() {
    val user = UserData("Denis", "123kkk")
    println(user.password)
    user.password = "adssa11"
    user.name = "Ivan"
    println(user.name)
}
