package lesson8

fun main() {

    val recipe = arrayOf("картошка", "соль", "перец", "паприка", "куркума", "чеснок")
    println(recipe.contentToString())
    println("Какой ингридиент вы хатите заменить?")
    val userIngridient = readln()
    val indexIngridient = recipe.indexOf(userIngridient)

    if (indexIngridient == -1) {
        println("Введенного вами ингридиента нет в списке")
    } else {
        println("На какой ингидиент вы хатите заменить $userIngridient")
        val newUserIngridient = readln()
        recipe[indexIngridient] = newUserIngridient
        println("Готово! Вы сохранили следующий список: ${recipe.contentToString()}")
    }

}





