class CategoryDish(
    val nameCategory: String,
    val shortDescription: String,
    val recipeMap: MutableMap<String, String> = mutableMapOf(),
) {
    fun showCategoryDish() {
        println("Категория: $nameCategory,\nОписание: $shortDescription")
    }

    fun showRecipesView() {
        println(nameCategory)
        println(recipeMap)
    }
}

class Ingridient(
    val nameDish: String,
    val cookingMethod: String,
    var ingredientsWithGrams: MutableMap<String, Int>,
    var favorite: Boolean = false,
) {
    fun printCookingMethod() {
        println("Способ приготовления:")
        println()
        println(cookingMethod)
    }

    fun calculateIngredients() {
        println(nameDish)
        println()
        println("Введите количество порций: ")

        val numberServings: String = readln()
        println("количество порций: $numberServings")

        for ((ingredient, grams) in ingredientsWithGrams) {
            ingredientsWithGrams[ingredient] = grams * numberServings.toInt()
        }
        for ((ingredient, grams) in ingredientsWithGrams) {
            println("$ingredient: $grams грамм")
        }
    }

    fun addFavorites() {
        println("Добавить в избрнное данное блюдо?")
        val userResponse = readln()
        if (userResponse.equals("Да", ignoreCase = true)) {
            favorite = true
            println("Блюдо добавленно в избранное")
        }
    }
}

fun main() {
    val categoryList =
        listOf(
            CategoryDish("Бургеры", "Рецепты всех популярных видов бургеров"),
            CategoryDish("Десерты", "Самые вкусные рецепты десертов специально для вас"),
            CategoryDish("Пицца", "Пицца на любой вкус и цвет. Лучшая подборка для вас"),
            CategoryDish("Рыба", "Печеная, жаренная, сушенная. Любая рыба на ваш вкус"),
            CategoryDish("Супы", "От классического до экзотики, мир в одной тарелке"),
            CategoryDish("Салаты", "Хрустящий колейдоскоп под соусом вдохновений"),
        )

    val ingridientsBurger =
        Ingridient(
            nameDish = "Бургер",
            cookingMethod =
                "1. Нагрей сковороду на среднем огне и добавь немного масла.\n" +
                    "2. Сложи котлету говядины на сковороду и жарь до готовности (около 3-4 минут с каждой стороны).\n" +
                    "3. В это время нарежь помидор, лук, салат и сыр.\n" +
                    "4. Нарежь булочку на половинки и поджарь их на сковороде.\n" +
                    "5. Собери бургер: на нижней половинке булочки положи лист салата, " +
                    "котлету, ломтик сыра, лук, помидор, и закрой второй половинкой булочки.\n" +
                    "6. Подаём бургер с картошкой фри или овощными чипсами",
            ingredientsWithGrams =
                mutableMapOf(
                    "фарш" to 300,
                    "лук" to 30,
                    "кетчуп" to 10,
                    "огурец соленый" to 30,
                ),
            favorite = true,
        )

    val recipesBurgers =
        CategoryDish(
            nameCategory = "Бургеры",
            shortDescription = "",
            recipeMap =
                mutableMapOf(
                    "Бургер с помидорами" to "Классический бургер",
                    "чизбургер на столе" to "Чизбургер",
                    "Большой бургер с грибами" to "Бургер с грибами и сыром",
                    "Бургер с авакадо и белым соусом" to "Бугер с курицей и авкадо",
                    "Бургер с рыбой" to "Бургер с рыбой",
                    "Бургер с кортошкой фри и зеленью" to "Веганский бургер",
                    "Бургер с красным перцем" to "Острый бургер",
                ),
        )

    ingridientsBurger.calculateIngredients()
    println()
    ingridientsBurger.printCookingMethod()
    println()
    ingridientsBurger.addFavorites()
    println()
    recipesBurgers.showRecipesView()
    println()
    for (category in categoryList) {
        category.showCategoryDish()
    }
}
