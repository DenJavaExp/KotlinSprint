class PlayerGame(val name: String, val key: Boolean)

fun main() {
    val openDoor: (PlayerGame) -> Unit
    openDoor = {
        if (it.key == true) {
            println("Дверь открыта!")
        } else {
            println("У вас нет ключа для этой двери")
        }
    }

    val player = PlayerGame("Player", true)
    val player1 = PlayerGame("Gamer", false)

    openDoor(player)
    openDoor(player1)
}
