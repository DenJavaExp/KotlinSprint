package lesson4

fun main() {

     val treningToday = 5
     val evenNumbered = 0
     val checksDay = 2

     println(
          """
          Упражнения для рук: ${treningToday % checksDay != evenNumbered}
          Упражнения для ног: ${treningToday % checksDay == evenNumbered}
          Упражнения для спины: ${treningToday % checksDay == evenNumbered}
          Упражнения для пресса: ${treningToday % checksDay != evenNumbered}
     """.trimIndent()
     )

}

