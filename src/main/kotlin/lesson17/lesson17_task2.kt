class Ship(
    name: String,
    speed: Int,
    portResidence: String,
) {
    var name = name
        get() = field
        set(value) {
            println("Изменять имя коробля нельзя")
        }
    private var speed = speed
        set(value) {
            field = value
        }

    var portResidence = portResidence
        set(value) {
            field = value
        }
}

fun main() {
    val ship = Ship("Svetlov", 400, "Canada")
    ship.name = "Moskva"
    println(ship.name)
}
