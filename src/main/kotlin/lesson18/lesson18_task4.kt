open class Box {
    open fun calculateArea() {
    }
}

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override fun calculateArea() {
        val areaBox = 2 * (length * width + width * height + length * height)
        println("Площад прямоугольной коробки равна = $areaBox")
        println()
    }
}

class CubicBox(
    val sideLength: Double,
) : Box() {
    override fun calculateArea() {
        val areaBox = 6 * Math.pow(sideLength, 2.0)
        println("Площад купической коробки равна = $areaBox")
        println()
    }
}

fun main() {
    val rectangularBox = RectangularBox(3.4, 4.0, 10.0)
    val cubicBox = CubicBox(2.5)

    rectangularBox.calculateArea()
    cubicBox.calculateArea()
}
