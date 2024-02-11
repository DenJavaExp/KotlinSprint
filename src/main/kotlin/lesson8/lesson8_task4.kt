package lesson8

fun main() {

    val recipe = arrayOf("картошка", "соль", "перец", "паприка", "куркума", "чеснок")
    println(recipe.contentToString())
    println("Какой ингридиент вы хатите заменить?")
    val userIngridient = readln()
    var check = 0

    for (i in recipe) {
        if (userIngridient == i) {
            println("На какой ингидиент вы хатите заменить $userIngridient")
            val newUserIngridient = readln()
            val indexIngridient = recipe.indexOf(userIngridient)
            recipe.set(indexIngridient, newUserIngridient)
            check++
        }
    }

    if (check == 0) {
        println("Введенного вами ингридиента нет в списке")
    } else println("Готово! Вы сохранили следующий список: ${recipe.contentToString()}")

}


