class BookPhone(
    var name: String?,
    var telephoneNumber: Long?,
    var companyName: String?,
) {
    fun addPersonList(listPhoneBook: MutableList<BookPhone>) {
        while (true) {
            println("Хотите добавить нового клиента?")
            val userResponse = readln()
            if (userResponse == "да") {
                println("Введите имя клиента:")
                name = readln()
                var controlTelephon = true
                while (controlTelephon) {
                    println("Введите номер клиента:")
                    telephoneNumber = readln().toLongOrNull()
                    if (telephoneNumber != null) {
                        controlTelephon = false
                    } else {
                        println("Вы не ввели номер телефона!")
                    }
                }

                println("Введите название компании:")
                companyName = readln()
                val person = BookPhone(name = name, telephoneNumber = telephoneNumber, companyName = companyName)
                listPhoneBook.add(person)
            } else {
                break
            }
        }
    }

    fun printPersonList(listPhoneBook: MutableList<BookPhone>) {
        for (person in listPhoneBook) {
            println("Имя клиента: ${person.name}")
            println("Тлефон клиента: ${person.telephoneNumber}")
            println("Название компании: ${person.companyName}")
        }
    }
}

fun main() {
    val listPhoneBook = mutableListOf<BookPhone>()
    val person = BookPhone(name = "", telephoneNumber = 0L, companyName = "")
    person.addPersonList(listPhoneBook)
    person.printPersonList(listPhoneBook)
}
