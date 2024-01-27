import java.util.Scanner

fun main() {

    val damage =  Scanner(System.`in`)
    val conditionShip = damage.nextBoolean()
    val crew = Scanner(System.`in`)
    val numberOfCrew = crew.nextInt()
    val food = Scanner(System.`in`)
    val numberOffood = food.nextInt()
    val weather =  Scanner(System.`in`)
    val goodWeather = weather.nextBoolean()

    println("${(conditionShip || numberOfCrew == 70 || numberOffood == 50) 
            && (numberOfCrew in 55 .. 70) 
            && (numberOffood >= 50) && goodWeather}" )

}

