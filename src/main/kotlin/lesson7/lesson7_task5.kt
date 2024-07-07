package lesson7

fun main() {
    println("Какую вы хотите длину пароля? : ")

    val lengthPassword = readln().toInt()

    var password = ""
    var charset: Char
    var charset2: Char
    var charset3: Char
    var randomChar: String

    for (i in 1..lengthPassword / 3) {
        charset = ('A'..'Z').random()
        charset2 = ('a'..'z').random()
        charset3 = ('0'..'9').random()
        randomChar = "$charset$charset2$charset3"
        password += randomChar
    }

    println(password)
}
