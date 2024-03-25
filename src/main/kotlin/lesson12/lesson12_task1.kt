package lesson12

class Weather {
    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: Boolean = false

    fun infoWeather() {
        println(
            "Погода на сегодня:\n" +
                "температура днем $daytimeTemperature\n" +
                "температура ночью $nightTemperature",
        )

        if (!precipitation) {
            println("Без осадков")
        } else {
            println("Ожидаются осадки")
        }
    }
}

fun main() {
    val weatherToday = Weather()
    weatherToday.daytimeTemperature = 12
    weatherToday.nightTemperature = 0
    weatherToday.precipitation = true
    weatherToday.infoWeather()
}
