package lesson10

import java.util.*

const val LOGIN = "denis@mail.ru"
const val PASSWORD = "Data22042011!"
val shoppingList = listOf("капуста", "морковь", "хлеб", "мясо", "доставка")
fun main() {
    println("Введите ваш логин:")
    val userLogin = readln()
    println("Введите ваш пароль:")
    val userPassword = readln()

    println(getShoppingCart(authorizing(userLogin, userPassword), shoppingList))
}

fun authorizing(userLogin: String, userPassword: String): Any? {
    val token = UUID.randomUUID().toString()
    println(token)

    return if (LOGIN == userLogin && PASSWORD == userPassword) {
        token
    } else {
        null
    }
}

fun getShoppingCart(function: Any?, shoppingList: List<String>): List<String> {

    if (function == null) {
        println("Данный пользователь не зарегистрирован")
    } else {
        return shoppingList
    }

    return TODO("Provide the return value")
}

//Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.
//
//Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает токен доступа.
//При неудачной авторизации возвращается null. Токен - текстовая строка, генерируемая методом авторизации
//(32 символа, которые включают цифры и буквы англ. алфавита). Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token
//
//Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).
//
//Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
//Переменные логин, пароль и корзина проинициализированы заранее и неизменяемы.