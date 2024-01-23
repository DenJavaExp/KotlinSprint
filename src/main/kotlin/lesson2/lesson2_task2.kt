fun main() {

    val NUMBER = 60
    var hours = 9
    var minutes = 39
    var travelMinutes = 457
    var departureTime = "$hours:$minutes"
    var travelTimeHours = travelMinutes / NUMBER
    var travelTimeMinutes = travelMinutes % NUMBER
    var travelTime = "$travelTimeHours:$travelTimeMinutes"
    var arrivalTimeHours = hours + travelTimeHours
    var arrivalTimeMinutes = minutes + travelTimeMinutes
    var arrivalTime = "$arrivalTimeHours:$arrivalTimeMinutes"

    println("Время отправления $departureTime")
    println("Время в пути $travelTime")
    println("Время прибытия $arrivalTime")

}

