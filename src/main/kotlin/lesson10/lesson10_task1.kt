package lesson10

fun main() {
    val human = "Human"
    val computer = "Machine"
    val pointsHuman = rollDice()
    val pointsMachine = rollDice()

    println("Бросайте кости:")
    println(
        "$human бросил кости и выполо значение ${pointsHuman}, \n" +
                "$computer бросил кости и выполо значение ${pointsMachine}"
    )
    println(decideWinner(pointsHuman, pointsMachine))
}

fun rollDice(): Int = (1..6).random()

fun decideWinner(pointsHuman: Int, pointsMachine: Int) {

    if (pointsHuman < pointsMachine) {
        println("Победил компьютер!")
    } else if (pointsHuman > pointsMachine) {
        println("Победил человек!")
    } else {
        println("Победила дружба!)")
    }
}


