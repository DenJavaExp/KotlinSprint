package lesson10

fun main() {
    val name1 = "Human"
    val name2 = "Machine"
    val castHuman = cast()
    val castMachine = cast()
    println("Бросайте кости:")
    println("$name1 бросил кости и выполо значение ${castHuman}, " +
            "$name2 бросил кости и выполо значение " +
            "${castMachine}, ${castCompare(castHuman, castMachine)}")
}

fun cast(): Int = (1..6).random()

fun castCompare (castHuman: Int?, castMachine: Int?) {

    if (castHuman != null) {
        if (castHuman < castMachine!!) {
            println("Победил компьютер!")
        } else if (castHuman > castMachine) {
            println("Победил человек!")
        } else {
            println("Победила дружба!)")
        }
    }
}

