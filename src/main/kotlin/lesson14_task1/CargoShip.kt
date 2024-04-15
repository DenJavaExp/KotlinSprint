class CargoShip(
    name: String,
    speed: Int,
) : LinerShip(name, speed, 1000, 0) {
    fun startLoadingIntoHold() {
        println("$name начата погрузка в трюмы обьемом $loadCapacity тонн.")
    }
}
