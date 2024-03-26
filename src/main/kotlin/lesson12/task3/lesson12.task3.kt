package lesson12.task3

const val CELSIUM = 273

class WeatherToDay(_daytimeTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {
    var daytimeTemperature: Int = _daytimeTemperature - CELSIUM
    var nightTemperature: Int = _nightTemperature - CELSIUM
    var precipitation: Boolean = _precipitation

    fun showWeather() {
        println(
            "Погода на сегодня:\n" +
                "температура днем $daytimeTemperature \n" +
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
    val weatherToDay =
        WeatherToDay(285, 273, true)
    weatherToDay.showWeather()
}
