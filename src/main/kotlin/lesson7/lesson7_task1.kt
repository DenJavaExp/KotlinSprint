package lesson7

fun main() {
    var password = ""
    for (i in 1..3) {

        val num = (0..9).random().toString()
        val str = ('a'..'z').random().toString()

       password = password + num + str
    }
    println(password)
}

