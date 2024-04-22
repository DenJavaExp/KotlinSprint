open class CelestialBody(
    val name: String,
    val atmosphere: Boolean,
    val landing: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    landing: Boolean,
    val size: Int,
    val haveSatellite: Boolean = false,
    val listSatellite: List<Satellite>,
) : CelestialBody(name, atmosphere, landing) {
    override fun toString(): String {
        return "Planet(name = $name,  Satellite = $listSatellite)"
    }

    fun printInfo() {
        println("Название планеты $name и у нее есть спутники:")
        for (satellite in listSatellite) {
            println(satellite.name)
        }
    }
}

class Satellite(
    name: String,
    atmosphere: Boolean,
    landing: Boolean,
    val size: Int,
) : CelestialBody(name, atmosphere, landing)

fun main() {
    val satellite1 = Satellite("Moon", false, true, 3474)
    val satellite2 = Satellite("Fobos", false, true, 1600)
    val satellite3 = Satellite("Daymos", false, true, 6200)

    val planet1 = Planet("Земля", true, true, 6371, listSatellite = listOf(satellite1))
    val planet2 = Planet("Mars", false, true, 6779, listSatellite = listOf(satellite2, satellite3))

    planet1.printInfo()
    planet2.printInfo()
}
