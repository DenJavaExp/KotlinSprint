package lesson10

fun main() {
    val asciiRangeSymbol: List<Char> =
        (START_SYMBOL..END_SYMBOL).map { it.toChar() }
    val asciiRangeNumber: List<Char> =
        (START_NUMBER..END_NUMBER).map { it.toChar() }

    println("Какую длуну пароля вы хотите?")
    val lengthPassword = readln().toInt()
    println(generatePassword(lengthPassword, asciiRangeSymbol, asciiRangeNumber))
}

const val START_SYMBOL = 32
const val END_SYMBOL = 47
const val START_NUMBER = 48
const val END_NUMBER = 57

fun generatePassword(lengthPassword: Int, asciiRangeSymbol: List<Char>, asciiRangeNumber: List<Char>): String {
    val generatePassword = arrayOfNulls<String>(lengthPassword)

    for (i in generatePassword.indices) {

        if (i % 2 == 0) {
            generatePassword[i] = asciiRangeSymbol.random().toString()
        } else {
            generatePassword[i] = asciiRangeNumber.random().toString()
        }
    }
    return generatePassword.joinToString("")
}

