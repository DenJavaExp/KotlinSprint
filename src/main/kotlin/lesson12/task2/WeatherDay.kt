package lesson12.task2

class WeatherDay(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val precipitation: Boolean,
) {
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
    val weatherToday =
        WeatherDay(
            daytimeTemperature = 12,
            nightTemperature = 0,
            precipitation = true,
        )

    weatherToday.infoWeather()
}
