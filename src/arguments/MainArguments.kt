package arguments

fun sayHello(greeting: String, itemsToGreet: List<String>): Unit {
    itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet") }
}

// vararg arguments are treated as an array, so we can iterate through them
fun sayHelloVararg(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val itemsToGreet = listOf("Vittorio", "World", "Giovanni")
    sayHello("Hello", itemsToGreet)
    sayHelloVararg("Good morning", "Matteo", "Giovanni", "Alberto", "Giulia")
}