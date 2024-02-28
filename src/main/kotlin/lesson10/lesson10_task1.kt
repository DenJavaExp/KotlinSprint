package lesson10

fun main() {
    val name1 = "Human"
    val name2 = "Machine"
    val castHuman = points()
    val castMachine = points()

    println("Бросайте кости:")
    println(
        "$name1 бросил кости и выполо значение ${castHuman}, \n" +
                "$name2 бросил кости и выполо значение ${castMachine}"
    )
    println(comparesPoints(castHuman, castMachine))
}

fun points(): Int = (1..6).random()

fun comparesPoints(castHuman: Int, castMachine: Int) {

    if (castHuman < castMachine) {
        println("Победил компьютер!")
    } else if (castHuman > castMachine) {
        println("Победил человек!")
    } else {
        println("Победила дружба!)")
    }
}


