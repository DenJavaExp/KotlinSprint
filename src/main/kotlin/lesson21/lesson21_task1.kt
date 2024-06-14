fun main() {
    fun String.vowelCount() {
        val vowel =
            setOf(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
                'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
                'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я',
            )

        println(this.count { it in vowel })
    }

    println("Введите слово:")
    val word = readln()
    word.vowelCount()
}
