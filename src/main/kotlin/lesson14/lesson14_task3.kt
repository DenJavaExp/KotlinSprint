import kotlin.math.roundToInt

const val COLOR_BLACK = "black"
const val COLOR_WITHE = "white"
const val PI = 3.14

abstract class Figure {
    abstract val color: String

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    private val radius: Double,
    override val color: String,
) : Figure() {
    override fun calculateArea(): Double {
        return ((radius * radius) * PI).roundToInt() * 100 / 100.0
    }

    override fun calculatePerimeter(): Double {
        return (2 * PI * radius).roundToInt() * 100 / 100.0
    }
}

class Rectangle(
    private val width: Double,
    private val height: Double,
    override val color: String,
) : Figure() {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return (width + height) * 2
    }
}

fun main() {
    val circle = Circle(10.0, COLOR_BLACK) // 68
    circle.calculateArea()
    circle.calculatePerimeter()

    val circle1 = Circle(15.4, COLOR_WITHE)
    circle1.calculateArea()
    circle1.calculatePerimeter()

    val circle2 = Circle(2.4, COLOR_WITHE)
    circle2.calculateArea()
    circle2.calculatePerimeter()

    val rectangle = Rectangle(5.0, 7.0, COLOR_WITHE)
    rectangle.calculateArea()
    rectangle.calculatePerimeter()

    val rectangle1 = Rectangle(5.5, 10.2, COLOR_BLACK)
    rectangle1.calculateArea()
    rectangle1.calculatePerimeter()

    val rectangle2 = Rectangle(2.1, 5.3, COLOR_WITHE)
    rectangle2.calculateArea()
    rectangle2.calculatePerimeter()

    val figuresList = listOf(circle, circle1, circle2, rectangle, rectangle1, rectangle2)
    var sumArea = 0.0
    var sumRectangle = 0.0
    for (figure in figuresList) {
        if (figure.color == "white") {
            sumArea += figure.calculateArea()
        } else if (figure.color == "black") {
            sumRectangle += figure.calculatePerimeter()
        }
    }
    println("Сумму площадей всех белых фигур ровна $sumArea")
    println("Сумма периметров всех черных фигур ровна $sumRectangle")
}
