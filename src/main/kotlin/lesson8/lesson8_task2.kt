package lesson8


fun main() {

    val recipe = arrayOf("картошка", "соль", "перец", "паприка", "куркума", "чеснок")
    println("Введите нужный ингридиент: ")
    val userIngredient = readln()

    for (ingredient in recipe) {
        if (userIngredient == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}
