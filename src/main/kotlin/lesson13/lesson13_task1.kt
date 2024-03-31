class PhoneDirectory(
    val name: String,
    val telephoneNumber: Long,
    val companyName: String?,
)

fun main() {
    val phoneDirectory =
        PhoneDirectory(
            name = "Denis",
            telephoneNumber = 88008888888L,
            companyName = null,
        )

    println(
        "Имя: ${phoneDirectory.name}, " +
            "телефон: ${phoneDirectory.telephoneNumber}," +
            " компания: ${phoneDirectory.companyName}",
    )
}
