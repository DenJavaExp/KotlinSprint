package lesson12.task3

class WeatherToDay {
    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: Boolean = false

    fun showWeatherCelsius() {
        println(
            "Погода на сегодня:\n" +
                "температура днем ${daytimeTemperature - 273} \n" +
                "температура ночью ${(nightTemperature - 273)}",
        )

        if (!precipitation) {
            println("Без осадков")
        } else {
            println("Ожидаются осадки")
        }
    }
}

fun main() {
    val weatherToDay = WeatherToDay()
    weatherToDay.daytimeTemperature = 285
    weatherToDay.nightTemperature = 273
    weatherToDay.precipitation = true
    weatherToDay.showWeatherCelsius()
}
