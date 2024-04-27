class Cube(
    private val number: Int = (0..6).random(),
) {
    fun getNumber() = number
}

fun main() {
    val cube = Cube()

    println(cube.getNumber())
}
