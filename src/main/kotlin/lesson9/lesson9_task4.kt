package lesson9

fun main() {

    println("Напишите 5 ингридиентов через запяту и пробел:")
    val ingridientList = readln()
    val delim = ", "
    val newIngridientList = ingridientList.split(delim).toMutableList()
    println(newIngridientList.sorted())

}

