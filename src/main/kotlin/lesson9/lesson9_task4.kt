package lesson9

fun main() {
    println("Напишите 5 ингридиентов через запяту и пробел:")
    val newIngridientList = readln().split(", ").toMutableList()
    println(newIngridientList.sorted())
}
