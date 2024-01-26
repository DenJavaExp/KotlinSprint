package lesson4

fun main() {

    val weatherSunny = true
    val awningOpen = true
    val airHumidity = 20
    val season = "winter"

    val legumesWeather = true
    val legumesAwningOpen = true
    val legumesAirHumidity = 20
    val legumesSeason = "not winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
            weatherSunny == legumesWeather
                    && awningOpen == legumesAwningOpen
                    && airHumidity == legumesAirHumidity
                    && season === legumesSeason
        }")

}

