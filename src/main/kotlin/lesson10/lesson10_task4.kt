package lesson10

fun main() {

    val human = "Human"
    val computer = "Machine"
    var pointsHuman: Int
    var pointsMachine: Int
    var wantGame = true
    var allPointHuman = 0
    var allPointMachine = 0
    var userResponse: String
    var countGame = 0
    var endWordRound: String

    while (wantGame) {
        println("Бросайте кости:")
        pointsHuman = rollDice()
        pointsMachine = rollDice()
        println(
            "$human бросил кости и выполо значение $pointsHuman, \n" +
                    "$computer бросил кости и выполо значение $pointsMachine"
        )
        println(decideWinner(pointsHuman, pointsMachine))
        allPointHuman += pointsHuman
        allPointMachine += pointsMachine
        countGame++
        println("Хотите сыграть еще?")
        userResponse = readln()

        endWordRound = if (countGame <= 4) "а" //окончание слова "раунд" в зависимости от значения
        else "ов"

        if (userResponse.equals("да", ignoreCase = true)) {
            wantGame = true
            continue
        } else if (userResponse.equals("нет", ignoreCase = true))
            wantGame = false

        println("Вы сыграли $countGame раунд$endWordRound . Счет человека $allPointHuman, счет компьютера $allPointMachine")
    }
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

