

fun main() {
    val elementList =
        listOf(
            "элемент 1",
            "элемент 2",
            "элемент 3",
            "элемент 4",
            "элемент 5",
            "элемент 6",
            "элемент 7",
            "элемент 8",
        )

    val lambdaMap = elementList.map { element -> element }

    for (i in lambdaMap.indices) {
        if ((i + 1) % 4 == 0) {
            println("Нажат ${lambdaMap[i]}")
        }
    }
}
