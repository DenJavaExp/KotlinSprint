package lesson4

fun main() {

     val treningToday = 5
     val evenNumbered = 0
     val checks = treningToday % 2

     println(
          """
          Упражнения для рук: ${checks != evenNumbered}
          Упражнения для ног: ${checks == evenNumbered}
          Упражнения для спины: ${checks == evenNumbered}
          Упражнения для пресса: ${checks != evenNumbered}
     """.trimIndent()
     )

}

