abstract class WeatherStationStats

class Temperature(val temperature: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: String) : WeatherStationStats()

class WeatherServer() {
    fun sendWeatherMessage(temperature: Int) {
        println("Температура $temperature градусов Цельсия")
    }

    fun sendWeatherMessage(precipitationAmount: String) {
        println("Ожидается $precipitationAmount")
    }
}

fun main() {
    val temperature = Temperature(25)
    val precipitationAmount = PrecipitationAmount("Дождь")
    val weatherServer = WeatherServer()

    weatherServer.sendWeatherMessage(temperature.temperature)
    weatherServer.sendWeatherMessage(precipitationAmount.precipitationAmount)
}
