interface Flying {
    fun fly()
}

interface Floating {
    fun float()
}

class Carp : Floating {
    override fun float() {
        println("Карась поплыл по реке.")
    }
}

class Duck : Flying, Floating {
    override fun fly() {
        println("Утка взлетает над озером.")
    }

    override fun float() {
        println("Утка поплыла по воде.")
    }
}

class Seagull : Flying {
    override fun fly() {
        println("Чайка машет крыльями и взлетает.")
    }
}

fun main() {
    val duck = Duck()
    val carp = Carp()
    val seagull = Seagull()

    duck.fly()
    duck.float()
    carp.float()
    seagull.fly()
}
