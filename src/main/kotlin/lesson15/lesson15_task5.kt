var generalСargo: Int = 0
var allPassanger: Int = 0

class PassengerCar(
    override val mark: String,
    override val passengerCapacity: Int,
    override val cargoCapacity: Int,
    override val speed: Int,
) :
    CarMove, PassengerTransportation {
    override fun move() {
        println("$mark Автомобиль тронулся с места и развил скорость $speed км/ч")
    }

    override fun passengerTransportation() {
        println("Автомобиль $mark перевозит пассажиров")
        allPassanger += passengerCapacity
    }

    override fun loadingPassengers() {
        println("Пассажиры содятся в автомобиль $mark вместимость $passengerCapacity")
    }

    override fun unloadingPassengers() {
        println("Пассажиры освобождают автомобиль $mark")
    }
}

class GooseCar(
    override val mark: String,
    override val passengerCapacity: Int,
    override val cargoCapacity: Int,
    override val speed: Int,
) :
    CarMove, PassengerTransportation, CargoTransportation {
    override fun move() {
        println("Грузовой автомобиль $mark начал движение и развил скорость $speed км/ч")
    }

    override fun loadingCargo() {
        println("Грузовой автомобиль $mark начал загрузку кузова вместимостью $cargoCapacity")
    }

    override fun cargoTransportation() {
        println("Грузововй автомобиль $mark перевозит груз до точки назначения. Общий вес $cargoCapacity")
        generalСargo += cargoCapacity
    }

    override fun unloadingCargo() {
        println("Грузовой автомобиль $mark начал разгружать кузов вестимостью $cargoCapacity")
    }

    override fun loadingPassengers() {
        println("В грузовой автомобиль $mark содится пассажир")
    }

    override fun unloadingPassengers() {
        println("Из грузового автомобиля $mark выходит пассажир")
    }

    override fun passengerTransportation() {
        println("Грузовой автомобиль $mark перевозит пассажиров")
    }
}

interface CarMove {
    val mark: String
    val passengerCapacity: Int
    val cargoCapacity: Int
    val speed: Int

    fun move()
}

interface PassengerTransportation {
    fun passengerTransportation()

    fun loadingPassengers()

    fun unloadingPassengers()
}

interface CargoTransportation {
    fun cargoTransportation()

    fun loadingCargo()

    fun unloadingCargo()
}

fun main() {
    val passengerCar = PassengerCar("Toyota", 3, 0, 140)
    val gooseCar = GooseCar("Man", 1, 2000, 100)

    passengerCar.passengerTransportation()
    passengerCar.passengerTransportation()
    gooseCar.passengerTransportation()
    gooseCar.cargoTransportation()
    println("Всего было перевезено $generalСargo кг груза и $allPassanger пассажиров")
}
