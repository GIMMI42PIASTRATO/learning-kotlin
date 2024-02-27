package functions

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

// Unit non è necessario
fun sayHello(greeting: String, itemToGreet: String): Unit = println("$greeting $itemToGreet")

fun main() {
    println(sum(5, 5))
    sayHello("Hi", "Vittorio")
}