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
            distanceToEarth = 4.36,
        )

    val (namePlaceEvent, descriptionPlaceEvent, dateNow, distanceToEarth) = starSystem
    println("Имя звездной системы: $namePlaceEvent")
    println("Описание: $descriptionPlaceEvent")
    println("Дата и время: $dateNow")
    println("Расстояние до Земли: $distanceToEarth световых лет")
}
