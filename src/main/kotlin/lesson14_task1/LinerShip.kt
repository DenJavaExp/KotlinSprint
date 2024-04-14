open class LinerShip(
    val name: String,
    val speed: Int,
    var loadCapacity: Int,
    val passengerCapacity: Int = 1500,
) {
    fun boardingPassengers() {
        println("$name обьявил посадку пассажиров с вместимостью $passengerCapacity персон")
    }

    fun sailAway() {
        println("$name начал движение и набрал максимаьную скорость $speed узлов")
    }

    fun moor() {
        println("$name снизил ход с максимальной скорости $speed узлов и начал пришвартовываться")
    }
}
