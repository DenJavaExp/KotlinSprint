class Folder() {
    private var sicret = true
    private val filesNumber = 200

    fun getFilesNumber(): Int {
        if (sicret) {
            println("“скрытая папка” и количество файлов – 0")
        } else {
            println(!sicret)
            println("количесто файлов в папке $filesNumber")
        }
        return filesNumber
    }
}

fun main() {
    val folder = Folder()
    println(folder.getFilesNumber())
}
