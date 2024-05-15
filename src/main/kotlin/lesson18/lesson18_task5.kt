class Ring(
    val radius: Float,
)

class Square(
    val lengthSide: Int,
)

class Dot(
    val thickness: Float,
)

class Screen() {
    fun draw(
        coordinateX: Int,
        coordinateY: Int,
        radius: Float,
    ) {
        println("Фигура круг нарисованна в координатах по оси X - $coordinateX и по оси Y - $coordinateY, радус - $radius")
    }

    fun draw(
        coordinateX: Int,
        coordinateY: Int,
        lengthSide: Int,
    ) {
        println("Фигура квадрат нарисованна в координатах по оси X - $coordinateX и по оси Y - $coordinateY, длина стороны - $lengthSide")
    }

    fun draw(
        coordinateX: Float,
        coordinateY: Float,
        thickness: Float,
    ) {
        println("Фигура точка нарисованна в координатах по оси X - $coordinateX и по оси Y - $coordinateY, ширина - $thickness")
    }
}

fun main() {
    val screen = Screen()
    val ring = Ring(12.5f)
    val square = Square(6)
    val dot = Dot(1.1f)

    screen.draw(4, 5, ring.radius)
    screen.draw(5, 6, square.lengthSide)
    screen.draw(5.6f, 5.6f, dot.thickness)
}
