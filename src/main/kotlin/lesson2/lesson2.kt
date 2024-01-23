package lesson2

fun main() {
    val a = 5
    val b = 7
    val sum = a + b

    //нелья обьявить переменную без инициализации.
    // не обходимо либо проинициализировать, либо принудительно обьявить тип.

    //println(a + b)
    println(sum)
    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2)

    val firstNum1: Float = 10f
    val firstNum2: Float = 3f
    println(firstNum1 / firstNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)

    //остаток отделения
    println(10 % 3)
    println(10 % 2)

    //конечный тип переменной
    val c = intNum1 / firstNum1
    println(c::class)

    val d = intNum1 + firstNum1 + doubleNum1
    println(d::class.simpleName)

    //инкремент, декремент

    var counter = 0
    counter += 1
    counter++
    println(counter)

    counter -= 1
    --counter
    ++counter

    //сравнение
    //a = 5, b = 7
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a == b)
    println(a != b)

}