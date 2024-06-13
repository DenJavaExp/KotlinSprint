fun main() {
    fun List<Int>.evenNumbersSum(listNum: List<Int>) {
        val result = listNum.filter { it % 2 == 0 }
        println(result.sum())
    }

    val listNum = listOf<Int>(4, 22, 1, 37, 12, 11)
    listNum.evenNumbersSum(listNum)
}
