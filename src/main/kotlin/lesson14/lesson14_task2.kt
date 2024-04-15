open class Liner(
    val name: String,
    val speed: Int,
    var loadCapacity: Int,
    val passengerCapacity: Int = 1500,
) {
    open fun startLoadingIntoHold() {
        println("$name выдвинул горизонтальный трап со шкафута для загрузки в трюм обьемом: $loadCapacity")
    }

    fun boardingPassengers() {
        println("$name обьявил посадку пассажиров на борд вместимостью $passengerCapacity")
    }

    fun sailAway() {
        println("$name начал движение и набрал максимаьную скорость $speed узлов!")
    }

    fun moor() {
        println("$name снизил ход с максимальной скорости $speed узлов и начал пришвартовываться")
    }
}

class Cargo(
    name: String,
    speed: Int,
) : Liner(name, speed, 1000, 0) {
    override fun startLoadingIntoHold() {
        println("$name активировал погрузочный кран для загрузки в трюм обьемом: $loadCapacity")
    }
}

class IceBreaker(
    name: String,
    speed: Int,
) : Liner(name, speed, 500, 0) {
    override fun startLoadingIntoHold() {
        println("$name открыл ворота со стороны кармы для загрузки в трюм обьемом: $loadCapacity")
    }

    fun startCrackingIce() {
        println("$name включил режим колки льда.")
    }
}

fun main() {
    val cargoShip =
        Cargo("Svetlov", 200)
    val linerShip = Liner("Cruise", 200, 100)
    val icebreaker = IceBreaker("Arctic", 100)

    cargoShip.startLoadingIntoHold()
    cargoShip.moor()
    println()
    linerShip.startLoadingIntoHold()
    linerShip.boardingPassengers()
    linerShip.sailAway()
    linerShip.moor()
    println()
    icebreaker.startLoadingIntoHold()
    icebreaker.sailAway()
    icebreaker.startCrackingIce()
}

// Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
//
// Каждый тип корабля обладает уникальным способом погрузки:
//
// - лайнер выдвигает горизонтальный трап со шкафута;
// - грузовой корабль активирует погрузочный кран;
// - ледокол открывает ворота со стороны кормы.
//
// Реализуй методы погрузки, специфичные для каждого вида корабля.
//
// Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
