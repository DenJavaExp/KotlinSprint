class Gamer(val name: String, var health: Int, val healthMax: Int)

fun main() {
    val gamer = Gamer("Player", 90, 100)
    val gamer2 = Gamer("Player2", 30, 120)
    val heal: (Gamer) -> Unit

    heal = {
        it.health = it.healthMax
        println("Здоровье игрока востановленно ${it.health}")
    }

    heal(gamer)
    heal(gamer2)
}
