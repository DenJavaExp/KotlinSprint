package lesson7


fun main() {

    for (i in 1..3) {

        val num = (0..9).random().toString()
        val str = ('a'..'z').random().toString()

        print(num + str)
    }
}

