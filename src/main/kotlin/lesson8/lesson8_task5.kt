package lesson8

fun main() {
    println("Какое количество ингридиентов будет в рецепте?")
    val numIngridient = readln().toInt()
    val recept = arrayOfNulls<String>(numIngridient)
    println("Ведите ингридиенты по одному:")

    for (i in recept.indices) {
        val userIngridient = readln()
        recept[i] = userIngridient
    }
    println("Ваш рецепт: ${recept.contentToString()}")

}


