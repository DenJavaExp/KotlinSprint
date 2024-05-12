enum class Fish {
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH,
}

fun setFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGEL_FISH -> println("Cкалярия")
        Fish.GOLD_FISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}

fun main() {
    val listFish: List<Fish> = listOf(Fish.GUPPY, Fish.ANGEL_FISH, Fish.GOLD_FISH, Fish.SIAMESE_FIGHTING_FISH)

    for (i in listFish) {
        setFish(fish = i)
    }
}
