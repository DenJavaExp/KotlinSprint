class RegBook(val bookName: String, val aftorName: String) {
//    override fun toString(): String {
//        return "$bookName, $aftorName"
//    }
}

data class BookData(val bookName: String, val aftorName: String)

fun main() {
    val regularBook = RegBook("Онегин", "Пушкин")
    val regularBook1 = RegBook("Онегин", "Пушкин")
    val dataBook = BookData("Малыш и Карлсон", "Лингрент")
    val dataBook1 = BookData("Малыш и Карлсон", "Лингрент")

    println(regularBook) // в данном случае метод toString не переопределен и по умолчанию
    // выводит название класса объекта => разделитель @ => и HashCode объекта
    println(regularBook1)

    println(dataBook) // в данном случае, у Data Class метод toString переопределен и выводит данные которые хранят свойства объекта
    println(dataBook1)
}
