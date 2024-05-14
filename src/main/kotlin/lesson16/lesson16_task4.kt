class Order(
    private val numberOrder: Int,
    private var statusOrder: Boolean,
) {
    private fun setStatesOrder(newStatusOrder: Boolean) {
        statusOrder = newStatusOrder
    }

    fun changeOrderStatus(newStatusOrder: Boolean) {
        setStatesOrder(newStatusOrder)
        if (newStatusOrder == true) {
            println("Статус заказа изменен на ГОТОВ")
        } else {
            println("Статус заказа В ОБРАБОТКЕ")
        }
    }
}

fun main() {
    val order = Order(1112332, false)
    order.changeOrderStatus(true)
}
