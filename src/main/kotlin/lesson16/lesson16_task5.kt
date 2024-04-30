const val DAMAGE = 50
const val COMPLETELY_HEALTHY = 100

class Player(
    private val name: String,
    private var health: Int,
    private var impactForce: Int,
) {
    fun takeDamage() {
        health -= DAMAGE
        println("Игрок $name получил урон $DAMAGE, уровень здоровья = $health")
        if (health == 0) {
            die()
        }
    }

    fun heals() {
        if (health > 0) {
            health = COMPLETELY_HEALTHY
            println("Игрок $name выпил зелье здоровья и полностью востановился. Уровень здоровья = $health")
        } else {
            println("Игрок $name мертв, лечение недоступно!")
        }
    }

    private fun die() {
        impactForce = 0
        println("Игрок $name умер, сила удара = $impactForce, здоровье = $health")
    }
}

fun main() {
    val player = Player("John", 100, 5)

    player.takeDamage()
    player.heals()
    player.takeDamage()
    player.takeDamage()
    player.heals()
    player.heals()
}
