class DirectoryPhone(
    val name: String,
    val telephoneNumber: Long,
    val companyName: String?,
) {
    fun printInfo() {
        println(
            "- Имя: $name,\n" +
                "- Номер: $telephoneNumber,\n" +
                "- Компания: ${companyName ?: "<строка не указанна>"}",
        )
    }
}

fun main() {
    val phoneDirectory =
        DirectoryPhone(
            name = "Denis",
            telephoneNumber = 88008888888L,
            companyName = null,
        )

    phoneDirectory.printInfo()
}
