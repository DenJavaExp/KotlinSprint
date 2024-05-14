class Folder(name: String, private val filesNumber: Int, private var sicret: Boolean = true) {
    val name = name
        get() {
            if (this.sicret) {
                println("“скрытая папка” и количество файлов – 0")
            } else {
                println("количесто файлов в папке $filesNumber")
            }
            return field
        }
}

fun main() {
    val folder = Folder("Fails", 200)
    println(folder.name)
}
