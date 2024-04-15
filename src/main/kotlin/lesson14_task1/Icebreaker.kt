class Icebreaker(
    name: String,
    speed: Int,
) : LinerShip(name, speed, 500, 0) {
    fun startCrackingIce() {
        println("$name включил режим колки льда.")
    }
}
