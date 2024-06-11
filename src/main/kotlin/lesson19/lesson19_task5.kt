enum class SEX(val sex: String) {
    MAN("М"),
    WOMAN("Ж"),
}

class Human(val name: String, val sex: SEX) {
    override fun toString(): String {
        return "Персона (имя: $name, пол: ${sex.sex})"
    }
}

fun main() {
    fun addPerson() {
        val listHuman = mutableListOf<Human>()
        var countPerson = 0

        while (countPerson < 5) {
            println("Введите имя:")
            val name = readln()
            println("Введите пол (М / Ж):")
            val sexInput = readln()
            val sex =
                if (sexInput == SEX.MAN.sex) {
                    SEX.MAN
                } else {
                    SEX.WOMAN
                }
            val human = Human(name = name, sex = sex)
            listHuman.add(human)
            countPerson++
        }

        println(listHuman.toString())
    }

    println(
        "Правило ввода данных в картотеку:\n" +
            "Вводите имя используя кириллицу\n" +
            "Вводите пол используя значения М и Ж кириллицы",
    )
    println()
    addPerson()
}
