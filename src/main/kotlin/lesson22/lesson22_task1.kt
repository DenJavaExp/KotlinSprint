class RegularBook(val bookName: String, val aftorName: String)

data class DataBook(val bookName: String, val aftorName: String)

fun main() {
    val regularBook = RegularBook("Онегин", "Пушкин")
    val regularBook1 = RegularBook("Онегин", "Пушкин")
    val dataBook = DataBook("Малыш и Карлсон", "Лингрент")
    val dataBook1 = DataBook("Малыш и Карлсон", "Лингрент")

    println(regularBook == regularBook1) // сравниваются ссылки объектов
    println(dataBook == dataBook1) // сравниваются свойства объектов
}
