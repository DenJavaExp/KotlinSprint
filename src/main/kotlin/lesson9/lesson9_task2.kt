package lesson9

fun main() {

    val listIngridient = mutableListOf<String>("перец", "чеснок", "соль")
    println("В рецепте есть базовые ингредиенты: $listIngridient")
    println("Желаете добавить еще?")
    val userDecision = readln()
    if (userDecision.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userIngridient = readln()
        listIngridient.add(userIngridient)
        println("Теперь в рецепте есть следующие ингредиенты: $listIngridient")
    } else {
        return
    }
}

