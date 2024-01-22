fun main() {
    val secondsAll = 6480
    val minutesAll = secondsAll / 60
    val sec = secondsAll % 60
    val min = minutesAll % 60
    val hours = minutesAll / 60

    val time = String.format("%02d:%02d:%02d", hours, min, sec)
    println(time)
}