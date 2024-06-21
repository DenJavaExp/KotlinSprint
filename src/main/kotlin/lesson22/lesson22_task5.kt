@file:Suppress("ktlint:standard:no-wildcard-imports")

import java.util.*

data class GalacticGuide(
    val namePlaceEvent: String,
    val descriptionPlaceEvent: String,
    val dateNow: Date,
    val distanceToEarth: Double,
)

fun main() {
    val starSystem =
        GalacticGuide(
            "Alpha Centaurip",
            "тройная звёздная система в созвездии Центавра",
            dateNow = Calendar.getInstance().time,
            4.36,
        )

    val (component1, component2, component3, component4) = starSystem
    println("Имя звездной системы: $component1")
    println("Описание: $component2")
    println("Дата и время: $component3")
    println("Расстояние до Земли: $component4 световых лет")
}
