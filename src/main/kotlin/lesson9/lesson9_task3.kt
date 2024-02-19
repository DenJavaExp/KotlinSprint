package lesson9

fun main() {

    val listIngridient = mutableListOf<Int>(2, 50, 15)
    println("Какое количество порций омлета вы хотите приготовить? ")
    val userPortions = readln().toInt()
    val newListIngridient = listIngridient.map { it * userPortions }
    println(
        "На $userPortions порций вам понадобится: " +
                "Яиц ${newListIngridient[0]}– " +
                "молока – ${newListIngridient[1]}, " +
                "сливочного масла – ${newListIngridient[2]}"
    )
}




