class PostalParcel(
    parcelNumber: Int,
    var movementCounter: Int = 0,
    location: String,
) {
    var location = location
        set(value) {
            field = value
            movementCounter++
            field = value
        }
}

fun main() {
    val postalParcel = PostalParcel(123, location = "Russia")
    postalParcel.location = "USA"
    println(postalParcel.movementCounter)
    println(postalParcel.location)
}
