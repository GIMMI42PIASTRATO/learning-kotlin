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

// Default arguments are used if no arguments are passed to the function during the call
fun greetPerson(greeting: String = "Hello", person: String = "Kotlin") = println("$greeting $person")

fun main() {
    val itemsToGreet1 = listOf("Vittorio", "World", "Giovanni")
    sayHello("Hello", itemsToGreet1)
    println("----------------------------------")

    // The arguments of vararg itemsToGreat will be stored inside an Array
    sayHelloVararg("Good morning", "Matteo", "Giovanni", "Alberto", "Giulia")
    println("----------------------------------")

    // During compilation, it is not likely that the values we need to pass to a function are in the form of an array, so in order to pass them to our vararg parameter we can use the spread operator
    val itemsToGreet2 = arrayOf("Python", "Kotlin", "Javascript")
    sayHelloVararg("Ciao", *itemsToGreet2)
    println("----------------------------------")

    // Named arguments are useful if you need to mix the order of the arguments
    greetPerson(person = "Vittorio", greeting = "Hi")
    greetPerson(person = "Giovanni")
}