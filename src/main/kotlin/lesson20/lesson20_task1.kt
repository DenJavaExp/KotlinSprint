

fun main() {
    println("Как вас зовут?")
    val userName = readln()
    val hello: () -> Unit
    hello = { println("С наступающим Новым Годом $userName") }
    hello()
}
