package lesson4

fun main() {

    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    println(
        "Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': " +
                "${
                    (weightCargo1 >= MIN_WEIGHT) && 
                            (weightCargo1 <= MAX_WEIGHT) && 
                            (volumeCargo1 < MAX_VOLUME)
                }"
    )

    println(
        "Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
                "${
                    (weightCargo2 >= MIN_WEIGHT) && 
                            (weightCargo2 <= MAX_WEIGHT) && 
                            (volumeCargo2 < MAX_VOLUME)
                }"
    )

}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

