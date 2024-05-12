

open class Animal(
    name: String,
) {
    open fun eat() {
    }

    open fun sleep() {
    }
}

class Fox(val name: String) : Animal(name) {
    override fun eat() {
        println("$name ест ягоды")
    }

    override fun sleep() {
        println("$name спит в норе")
    }
}

class Dog(val name: String) : Animal(name) {
    override fun eat() {
        println("$name грызёт кости")
    }

    override fun sleep() {
        println("$name спит в бутке")
    }
}

class Cat(val name: String) : Animal(name) {
    override fun eat() {
        println("$name есть рыбу")
    }

    override fun sleep() {
        println("$name спит на диване")
    }
}

fun main() {
    val fox = Fox("Патрикеевна")
    val dog = Dog("Шарик")
    val cat = Cat("Мурка")
    val animalList: List<Animal> = listOf(fox, dog, cat)

    for (i in animalList) {
        i.eat()
        i.sleep()
        println()
    }
}
