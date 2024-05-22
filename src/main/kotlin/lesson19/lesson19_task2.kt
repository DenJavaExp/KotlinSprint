

enum class Categories(val categoryName: String) {
    CLOTHES("Одежда"),
    OFFICE_SUPPLIES("Канцелярские товары"),
    DIFFERET("Разное"),
    ERROR("Неизвестная катергория"),
    ;

    fun infoCategory() {
        return println(categoryName)
    }
}

class Commodity(
    val nameProduct: String,
    val id: Int,
    val category: Categories,
) {
    fun infoProduct(
        nameProduct: String,
        id: Int,
        category: Categories,
    ) {
        println("Товар $nameProduct категории ${category.categoryName} c ID $id")
    }
}

fun main() {
    val category = Categories.CLOTHES
    val commodity = Commodity("Брюки", 101, category)
    commodity.infoProduct(commodity.nameProduct, 101, commodity.category)
    category.infoCategory()
}
