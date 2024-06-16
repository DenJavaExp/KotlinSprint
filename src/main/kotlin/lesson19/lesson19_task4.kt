enum class Cartridges(val unitDamage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var unitDamage: Cartridges? = null) {
    fun loadNewCartridges(cartridge: Cartridges) {
        this.unitDamage = cartridge
        println("Танк заряжен потронами с уроном $unitDamage")
    }

    fun shot() {
        return println("Танк выстрелил и нанес урон ${unitDamage?.unitDamage ?: 0}")
    }
}

fun main() {
    val tank1 = Tank()

    tank1.loadNewCartridges(Cartridges.BLUE)
    tank1.shot()
    tank1.loadNewCartridges(Cartridges.GREEN)
    tank1.shot()
    tank1.loadNewCartridges(Cartridges.RED)
    tank1.shot()
}
