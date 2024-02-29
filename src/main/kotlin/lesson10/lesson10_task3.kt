package lesson10

fun main() {
    val asciiRange: List<Char> = (START_SYMBOL..END_SYMBOL).map { it.toChar() } + ' '
    val lengthPassword = readln().toInt()

    println(generatePassword(lengthPassword, asciiRange.toString()))
}

const val START_SYMBOL = 33
const val END_SYMBOL = 57

fun generatePassword(lengthPassword: Int, asciiRange: String): String {
    val generatePassword = (asciiRange.indices).shuffled().take(lengthPassword)
    val randomChars = generatePassword.map { asciiRange[it] }

    return randomChars.joinToString("")
}

