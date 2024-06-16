import kotlin.math.pow
import kotlin.math.roundToInt

private const val P = 3.14

class Ring(
    private val radius: Double,
) {
    fun calculateLengthCircle() {
        println("Длина окружности равна: ${((2 * P * radius) * 100.0).roundToInt() / 100.0}")
    }

    fun calculateAreaCircle() {
        println("Плащадь круга равна: ${(P * (radius.pow(2.0)) * 100.0).roundToInt() / 100.0}")
    }
}

fun main() {
    val circle = Ring(10.0)

    circle.calculateLengthCircle()
    circle.calculateAreaCircle()
}
