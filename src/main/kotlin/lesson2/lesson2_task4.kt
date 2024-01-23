package lesson2

fun main() {

    val PERCENTS = 100 // используем данную костанту для расчетов процентов
    val buff = 20
    var crystals = 7
    var iron = 11
    var buffCrystals = ((crystals.toDouble() / PERCENTS) * buff)
    var buffIron = ((iron.toDouble() / PERCENTS) * buff)

    println(buffCrystals.toInt())
    println(buffIron.toInt())

}

