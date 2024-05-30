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

    val mapElement = mutableMapOf<Int, String>()

    elementList.forEachIndexed { index, s -> mapElement[index + 1] = "Нажат " + s }

    for ((key, value) in mapElement) {
        if (key % 4 == 0) {
            println(value)
        }
    }
}
