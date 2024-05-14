abstract class Cube() {
    abstract var numberCube: Int

    open fun rollDice(numberCube: Int) {
        this.numberCube = (0..numberCube).random()
        println("У кубика с $numberCube гранями \n Выпало знчение: ${this.numberCube}")
    }
}

class Cube4(override var numberCube: Int) : Cube()

class Cube6(override var numberCube: Int) : Cube()

class Cube8(override var numberCube: Int) : Cube()

fun main() {
    val cube4 = Cube4(4)
    val cube6 = Cube6(6)
    val cube8 = Cube8(8)

    val listCube: List<Cube> = listOf(cube4, cube6, cube8)
    for (i in listCube) {
        i.rollDice(i.numberCube)
        println()
    }
}
