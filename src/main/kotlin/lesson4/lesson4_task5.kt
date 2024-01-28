package lesson4

fun main() {

    val damage = readln().toBoolean()
    val crew = readln().toInt()
    val food = readln().toInt()
    val weather = readln().toBoolean()

    println(
        "${
            (damage || crew == 70 || food == 50) &&
                    (crew in 55..70) && (food >= 50) && weather
        }"
    )

}

