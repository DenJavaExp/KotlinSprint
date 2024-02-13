package lesson8


fun main() {

    val recipe = arrayOf("картошка", "соль", "перец", "паприка", "куркума", "чеснок")
    println("Введите нужный ингридиент: ")
    val userIngredient = readln()
    var check: Int = 0

    for (ingredient in recipe) {
        if (userIngredient == ingredient) println("Ингредиент $ingredient в рецепте есть")
        check++
    }

    if (check == 0) {
        println("Такого ингредиента в рецепте нет")
    }

}
