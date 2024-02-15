package lesson9

fun main() {

    println("В рецепте есть следующие ингредиенты: ")
    val recept = listOf("перец", "соль", "чеснок", "паприка", "вода")
    for (ingridient in recept) {
        println(ingridient)
    }

}

