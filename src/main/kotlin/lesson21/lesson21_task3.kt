class GamePlayer(val name: String, var health: Int, val healthMax: Int)

fun main() {
    fun GamePlayer.isHealthy(): Boolean {
        return health == healthMax
    }

    val gamer = GamePlayer("Player", 90, 100)
    val gamer2 = GamePlayer("Player2", 30, 120)
    val heal: (GamePlayer) -> Unit

    heal = {
        it.health = it.healthMax
        println("Здоровье игрока востановленно ${it.health}")
    }

    heal(gamer)
    heal(gamer2)
    println(gamer.isHealthy())
    println(gamer2.isHealthy())
}
