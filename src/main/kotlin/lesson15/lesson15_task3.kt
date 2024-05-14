abstract class User(
    val name: String,
    val status: String,
    val age: Int,
    val avatar: String,
) {
    abstract fun readForum()

    abstract fun writeMessage()
}

class RegularUser(name: String, status: String, age: Int, avatar: String) : User(
    name = name,
    status = status,
    age = age,
    avatar = avatar,
) {
    override fun readForum() {
        println("Пользователь читает форум")
    }

    override fun writeMessage() {
        println("Пользователь пишет сообщение")
    }
}

class AdministratorUser(name: String, status: String, age: Int, avatar: String) : User(
    name = name,
    status = status,
    age = age,
    avatar = avatar,
) {
    override fun readForum() {
        println("Администратор читает форум")
    }

    override fun writeMessage() {
        println("Администратор пишет сообщение")
    }

    fun deleteMessage() {
        println("Администратор удалияет сообщение")
    }

    fun deleteUser() {
        println("Администратор удаляет пользователя")
    }
}

fun main() {
    val user1 = RegularUser("Denis", "online", 37, "men")
    val user2 = RegularUser("Nata", "online", 37, "girl")
    val user3 = RegularUser("Nikita", "online", 10, "boy")
    val user4 = RegularUser("Ivan", "online", 33, "men")
    val admin = AdministratorUser("Alexandr", "online", 44, "men")

    user1.readForum()
    user2.writeMessage()
    user3.readForum()
    user4.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}
