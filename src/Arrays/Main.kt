import kotlin.reflect.typeOf

fun sum(array: Array<Int>): Int {
    var result: Int = 0
    for (num in array) {
        result += num
    }
    return result
}

fun main() {
    val result = sum(arrayOf(5, 10, 15, 20, 25, 30, 35, 40))
    println(result)

    val unMutableArray = listOf("Ciao", "Sono", "Una", "Persona")
    // unMutableArray[0] = "Giovanni" ERROR
    println(unMutableArray.last())


    val mutableArray = mutableListOf("Ciao", "Sono", "Mutabile")
    mutableArray[0] = "Giovanni"
    println(mutableArray)


    // List
    // List are very similar to array
    val stringNumbers = listOf("1", "2", "3")
    val intNumber = stringNumbers.map { it.toInt() }
    println(stringNumbers)

    // è possibile modificare il nome dell'elmento corrente, in questo caso da it è diventato number
    stringNumbers.forEach { number ->
        println(number)
    }

    stringNumbers.forEachIndexed { index, num ->
        println("$num is at index $index")
    }


    // map
    // data strucutre che contengono coppie chiave valore
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) ->
        println("$key -> $value")
    }

    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMap.put(4, "d")
    mutableMap[5] = "e"
    println(mutableMap)
}

