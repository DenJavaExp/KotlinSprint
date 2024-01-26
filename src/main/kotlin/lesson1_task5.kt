fun main() {

    val secondsAll = 6480
    val minutesAll = secondsAll / NUMBER
    val sec = secondsAll % NUMBER
    val min = minutesAll % NUMBER
    val hours = minutesAll / NUMBER
    val time = String.format("%02d:%02d:%02d", hours, min, sec)
    println(time)

}

const val NUMBER = 60