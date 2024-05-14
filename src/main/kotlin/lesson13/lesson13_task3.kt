class PhoneBook(
    val name: String,
    val telephoneNumber: Long,
    val companyName: String?,
)

fun main() {
    val listPhoneBook =
        listOf(
            PhoneBook(
                name = "Denis",
                telephoneNumber = 88008888555L,
                companyName = null,
            ),
            PhoneBook(
                name = "Ruslan",
                telephoneNumber = 88008888444L,
                companyName = null,
            ),
            PhoneBook(
                name = "Andrey",
                telephoneNumber = 88008888333L,
                companyName = "null",
            ),
            PhoneBook(
                name = "Vladimir",
                telephoneNumber = 88008888111L,
                companyName = "NovoTek",
            ),
            PhoneBook(
                name = "Ivan",
                telephoneNumber = 88008888888L,
                companyName = "NorNickel",
            ),
        )

    val companyNames =
        listPhoneBook.mapNotNull { it.companyName }.also {
            println(it)
        }
}
