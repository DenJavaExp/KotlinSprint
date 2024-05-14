class Order {
    fun makeOrder(
        namberOrder: String,
        product: String,
    ) {
        println("Номер заказа $namberOrder \n Заказан товар: $product")
    }

    fun makeOrder(
        namberOrder: String,
        product: List<String>,
    ) {
        println("Номер заказа $namberOrder \n Заказаны товары: $product")
    }
}

fun main() {
    val order = Order()
    val order2 = Order()

    order.makeOrder("123", "tea")
    println()
    order2.makeOrder("456", listOf("tea", "sugar", "apple"))
}
