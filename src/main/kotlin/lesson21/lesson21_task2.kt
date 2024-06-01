fun main() {
    fun List<Int>.evenNumbersSum(listNum: List<Int>) {
        var sumEvenNum = 0
        for (i in listNum) {
            if (i % 2 == 0) {
                sumEvenNum += i
            }
        }
        println(sumEvenNum)
    }

    val listNum = listOf<Int>(4, 22, 1, 37, 12, 11)
    listNum.evenNumbersSum(listNum)
}
