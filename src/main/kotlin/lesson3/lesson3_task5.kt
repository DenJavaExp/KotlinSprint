package lesson3

fun main() {

    val str = "D2-D4;0"
    val delim = "-"
    val delim2 = ";"

    val list = str.split(delim, delim2)
    val fromWhich = list[0]
    val where = list[1]
    val strokeNumber = list[2]

    println(
        """
        $fromWhich
        $where
        $strokeNumber
    """.trimIndent()
    )

}

