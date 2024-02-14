package lesson8

fun main() {

    val recipe = arrayOf("картошка", "соль", "перец", "паприка", "куркума", "чеснок")
    println("Введите нужный ингридиент: ")
    val userIngredient = readln()
    val found = userIngredient in recipe

    if (found) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}

