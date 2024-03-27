package lesson4

fun main() {


    val isAwningOpen = true
    val airHumidity = 20
    val season = "winter"

    val legumesWeather = true
    val legumesAwningOpen = true
    val legumesAirHumidity = 20
    val legumesSeason = "not winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            IS_SUNNY == legumesWeather &&
                    isAwningOpen == legumesAwningOpen &&
                    airHumidity == legumesAirHumidity &&
                    season === legumesSeason
        }"
    )

}

const val IS_SUNNY = true


