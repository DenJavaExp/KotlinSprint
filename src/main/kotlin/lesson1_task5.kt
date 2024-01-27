fun main() {

    val secondsAll = 6480
    val minutesAll = secondsAll / SECONDS_IN_HOUR
    val sec = secondsAll % SECONDS_IN_HOUR
    val min = minutesAll % SECONDS_IN_HOUR
    val hours = minutesAll / SECONDS_IN_HOUR
    val time = String.format("%02d:%02d:%02d", hours, min, sec)
    println(time)

}

const val SECONDS_IN_HOUR = 60