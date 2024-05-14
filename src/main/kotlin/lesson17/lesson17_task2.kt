class Ship(
    name: String,
    speed: Int,
    portResidence: String,
) {
    var name = name
        set(value) {
            println("Изменять имя коробля нельзя")
        }
    private var speed = speed

    var portResidence = portResidence
}

fun main() {
    val ship = Ship("Svetlov", 400, "Canada")
    ship.name = "Moskva"
    println(ship.name)
}
