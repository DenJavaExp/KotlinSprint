enum class Cartridges(val unitDamage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var unitDamage: Int = 0) {
    fun loadNewCartridges(unitDamage: Int) {
        this.unitDamage = unitDamage
        println("Танк заряжен потронами с уроном $unitDamage")
    }

    fun shot() {
        return println("Танк выстрелил и нанес урон $unitDamage")
    }
}

fun main() {
    val tank1 = Tank()

    tank1.loadNewCartridges(Cartridges.BLUE.unitDamage)
    tank1.shot()
    tank1.loadNewCartridges(Cartridges.GREEN.unitDamage)
    tank1.shot()
    tank1.loadNewCartridges(Cartridges.RED.unitDamage)
    tank1.shot()
}
