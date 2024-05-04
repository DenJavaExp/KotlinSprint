class PostalParcel {
    val parcelNumber = 123
    var movementCounter = 0
    private var location = "Russia"

    fun setLocation(newLocation: String): Boolean {
        location = newLocation
        movementCounter++
        return true
    }

    fun getLocation(): String {
        return location
    }
}

fun main() {
    val postalParcel = PostalParcel()
    postalParcel.setLocation("USA")
    println(postalParcel.movementCounter)
    println(postalParcel.getLocation())
}
