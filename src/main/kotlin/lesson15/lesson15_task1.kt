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

class Duck : Flying {
    override fun fly() {
        println("Утка взлетает над озером.")
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
    carp.float()
    seagull.fly()
}
