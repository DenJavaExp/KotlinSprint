fun main() {
    fun List<Int>.evenNumbersSum() {
        val result = this.filter { it % 2 == 0 }
        println(result.sum())
    }

    val listNum = listOf<Int>(4, 22, 1, 37, 12, 11)
    listNum.evenNumbersSum()
}
