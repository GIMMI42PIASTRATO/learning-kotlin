
fun sayHello(greeting: String, itemsToGreet: List<String>): Unit {
    itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet") }
}

fun main() {
    val itemsToGreet = listOf("Vittorio", "World", "Giovanni")
    sayHello("Hello", itemsToGreet)
}