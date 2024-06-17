data class Person(val name: String, val age: Int, val salary: Int)

fun main() {
    val (name, age, salary) = Person("Petr", 32, 23000)

    println("Имя: $name")
    println("Возраст: $age")
    println("Зарплата: $salary")
}
