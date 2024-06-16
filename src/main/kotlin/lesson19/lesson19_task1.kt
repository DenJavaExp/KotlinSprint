enum class Fish {
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH,
}

fun printFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGEL_FISH -> println("Cкалярия")
        Fish.GOLD_FISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}

fun main() {
    val listFish: List<Fish> = Fish.values().toList()

    for (i in listFish) {
        printFish(fish = i)
    }
}
