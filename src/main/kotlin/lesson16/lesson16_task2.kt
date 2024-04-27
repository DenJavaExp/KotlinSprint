private const val P = 3.14

class Ring(
    private val radius: Double,
) {
    fun calculateLengthCircle() {
        println("Длина окружности равна: ${2 * P * 1}")
    }

    fun calculateAreaCircle() {
        println("Плащадь круга равна: ${P * (radius * radius)}")
    }
}

fun main() {
    val circle = Ring(10.0)

    circle.calculateLengthCircle()
    circle.calculateAreaCircle()
}
