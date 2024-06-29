abstract class WeatherStationStats

class Temperature(val dateTemperature: Int) : WeatherStationStats()

class PrecipitationAmount(val datePrecipitationAmount: Int) : WeatherStationStats()

class WeatherServer() {
    fun sendWeatherMessage(date: WeatherStationStats) {
        when (date) {
            is Temperature -> {
                println("Температура воздуха состовляет ${date.dateTemperature} градусов Цельсия")
            }

            is PrecipitationAmount -> {
                println("Уровень осадков сегодня состовляет ${date.datePrecipitationAmount} см от месячной нормы")
            }
        }
    }
}

fun main() {
    val weatherServer = WeatherServer()
    val temperature = Temperature(25)
    val precipitationAmount = PrecipitationAmount(23)

    weatherServer.sendWeatherMessage(temperature)
    weatherServer.sendWeatherMessage(precipitationAmount)
}
