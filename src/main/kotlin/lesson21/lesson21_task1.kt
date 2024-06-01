fun main() {
    fun String.vowelCount(word: String) {
        var wordList = listOf<Char>()
        val vowel =
            setOf(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
                'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
                'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я',
            )
        wordList = word.toList()
        var countVowel = 0
        for (i in wordList) {
            if (i in vowel) {
                countVowel++
            }
        }
        println("В слове $word глассных букв $countVowel")
    }

    println("Введите слово:")
    val word = readln()
    word.vowelCount(word)
}
