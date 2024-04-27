class Ring(
    private val radius: Double,
) {
    protected val pi = 3.14

    fun calculateLengthCircle() {
        println("Длина окружности равна: ${2 * pi * 1}")
    }

    fun calculateAreaCircle() {
        println("Плащадь круга равна: ${pi * (radius * radius)}")
    }
}

fun main() {
    val circle = Ring(10.0)
    circle.calculateLengthCircle()
    circle.calculateAreaCircle()
}
