open class Figura(
    val name: String,
)

class Ring(name: String, val coordinateX: Float, val coordinateY: Float) : Figura(name)

class Square(name: String, val coordinateX: Float, val coordinateY: Float) : Figura(name)

class Dot(name: String, val coordinateX: Int, val coordinateY: Int) : Figura(name)

class Screen {
    fun draw(ring: Ring) {
        println("Фигура ${ring.name} нарисованна в координатах по оси X - ${ring.coordinateX} и по оси Y - ${ring.coordinateY}")
    }

    fun draw(square: Square) {
        println("Фигура ${square.name} нарисованна в координатах по оси X - ${square.coordinateX} и по оси Y - ${square.coordinateY}")
    }

    fun draw(dot: Dot) {
        println("Фигура ${dot.name} нарисованна в координатах по оси X - ${dot.coordinateX} и по оси Y - ${dot.coordinateY}")
    }
}

fun main() {
    val ring = Ring("Круг", 4.4f, 5.5f)
    val square = Square("Квадрат", 6.1f, 7.3f)
    val dot = Dot("Точка", 10, 11)
    val screen = Screen()

    screen.draw(ring)
    screen.draw(square)
    screen.draw(dot)
}
