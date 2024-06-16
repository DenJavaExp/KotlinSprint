package lesson7


fun main() {

    println("Какую вы хотите длину пароля? : ")

    val lengthPassword = readln().toInt()
    var randomChar: String
    var password = ""
    var charset: Char
    var charset2: Char
    var charset3: Char
    var charset4: Char

    for (i in 0..lengthPassword) {
        charset = ('A'..'Z').random()
        charset2 = ('a'..'z').random()
        charset3 = ('0'..'9').random()
        charset4 = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')').random()
        randomChar = mutableListOf(charset, charset2, charset3, charset4).random().toString()
        password += randomChar
    }
    println(password)
}



