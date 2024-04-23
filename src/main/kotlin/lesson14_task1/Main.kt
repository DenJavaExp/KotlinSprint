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
        println("$name начал движение и набрал максимаьную скорость $speed узлов!")
    }

    fun moor() {
        println("$name снизил ход с максимальной скорости $speed узлов и начал пришвартовываться")
    }
}

class CargoShip(
    name: String,
    speed: Int,
) : LinerShip(name, speed, 1000, 0) {
    fun startLoadingIntoHold() {
        println("$name начата погрузка в трюмы обьемом $loadCapacity тонн.")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
) : LinerShip(name, speed, 500, 0) {
    fun startCrackingIce() {
        println("$name включил режим колки льда.")
    }
}

fun main() {
    val cargoShip =
        CargoShip("Svetlov", 200)
    val linerShip = LinerShip("Cruise", 200, 0)
    val icebreaker = Icebreaker("Arctic", 100)

    cargoShip.loadCapacity
    cargoShip.startLoadingIntoHold()
    cargoShip.moor()

    linerShip.boardingPassengers()
    linerShip.sailAway()
    linerShip.moor()

    icebreaker.sailAway()
    icebreaker.startCrackingIce()
}
