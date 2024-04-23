abstract class Product(
    val name: String,
    val quantity: Int,
)

interface ProductSearch {
    fun searchProduct(any: Any)
}

class MusicalInstrument(
    name: String,
    quantity: Int,
) : Product(name = name, quantity = quantity), ProductSearch {
    override fun searchProduct(any: Any) {
        println("«Выполняется поиск: $any»")
    }
}

class Accessoriesname(
    name: String,
    quantity: Int,
) : Product(name = name, quantity = quantity)

fun main() {
    val musicalInstrument = MusicalInstrument("Балалайка", 3)
    val accessoriesname = Accessoriesname("Комплект струн", 10)

    musicalInstrument.searchProduct(accessoriesname.name)
}
