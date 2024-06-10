enum class SEX(val sex: String) {
    MAN("М"),
    WOMAN("Ж"),
}

class Human(val name: String, val sex: String) {
    override fun toString(): String {
        return "Персона (имя: $name, пол: $sex)"
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
            var sex = readln()
            if (sex == SEX.MAN.sex) {
                sex = SEX.MAN.sex
            } else if (sex == SEX.WOMAN.sex) {
                sex = SEX.WOMAN.sex
            }
            val human = Human(name = name, sex)
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
