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
