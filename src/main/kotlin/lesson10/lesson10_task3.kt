package lesson10

fun main() {
    val asciiRange: List<Char> =
        (START_SYMBOL..END_SYMBOL).map { it.toChar() } //+ ' ' не знаю почему, но пробел все равно включается в диапозон, хотя его там нет.
    println("Какую длуну пароля вы хотите?")
    val lengthPassword = readln().toInt()
//    println(asciiRange.joinToString("")) // ля просмротра дипозона.
    println(generatePassword(lengthPassword, asciiRange.toString()))
}

const val START_SYMBOL = 33
const val END_SYMBOL = 57

fun generatePassword(lengthPassword: Int, asciiRange: String): String {
    val generatePassword = (asciiRange.indices).shuffled().take(lengthPassword)
    val randomChars = generatePassword.map { asciiRange[it] }

    return randomChars.joinToString("")
}

