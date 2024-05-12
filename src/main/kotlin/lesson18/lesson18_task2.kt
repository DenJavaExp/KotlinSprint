open class Cube {
    open fun rollDice() {
    }
}

class Cube4 : Cube() {
    override fun rollDice() {
        val numberCube = (0..4).random()
        println("У кубика с 4 гранями \n Выпало знчение: $numberCube")
    }
}

class Cube6 : Cube() {
    override fun rollDice() {
        val numberCube = (0..6).random()
        println(
            "У кубика с 6 гранями \n" +
                " Выпало знчение: $numberCube",
        )
    }
}

class Cube8 : Cube() {
    override fun rollDice() {
        val numberCube = (0..8).random()
        println(
            "У кубика с 8 гранями \n" +
                " Выпало знчение: $numberCube",
        )
    }
}

fun main() {
    val cube4 = Cube4()
    val cube6 = Cube6()
    val cube8 = Cube8()

    val listCube: List<Cube> = listOf(cube4, cube6, cube8)
    for (i in listCube) {
        i.rollDice()
        println()
    }
}
