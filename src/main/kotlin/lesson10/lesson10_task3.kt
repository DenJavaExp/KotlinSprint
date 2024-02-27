package lesson10

import java.lang.StringBuilder

fun main() {

    val charPassword = "0123456789!&#'()$*+,-./% " + "\""
    val lengthPassword = readln().toInt()
    println(generatePassword(lengthPassword, charPassword))
}

fun generatePassword(length: Int, charPassword: String): String {
    val sb = StringBuilder(length)
    for (i in 0 until length) {
        val random = (charPassword.indices).random()
        sb.append(charPassword[random])

    }
    return sb.toString()
}

