class Contact(
    var name: String,
    var telephoneNumber: Long?,
    var companyName: String?,
)

fun addPersonList(person: Contact): Contact {
    while (true) {
        println("Хотите добавить нового клиента?")
        val userResponse = readln()
        if (userResponse == "да") {
            println("Введите имя клиента:")
            person.name = readln()
            var controlTelephon = true
            while (controlTelephon) {
                println("Введите номер клиента:")
                person.telephoneNumber = readln().toLongOrNull()
                if (person.telephoneNumber != null) {
                    controlTelephon = false
                } else {
                    println("Вы не ввели номер телефона!")
                }
            }

            println("Введите название компании:")
            person.companyName = readln()
        } else {
            break
        }
    }
    return person
}

fun printPersonList(listPhoneBook: MutableList<Contact>) {
    for (person in listPhoneBook) {
        println("Имя клиента: ${person.name}")
        println("Тлефон клиента: ${person.telephoneNumber}")
        println("Название компании: ${person.companyName}")
    }
}

fun main() {
    val listPhoneBook = mutableListOf<Contact>()
    val person = Contact(name = "", telephoneNumber = 0L, companyName = "")
    listPhoneBook.add(addPersonList(person))
    printPersonList(listPhoneBook)
}
