// File: Person.kt
package classes

class Person(val firstName: String = "Peter", val lastName: String = "Griffin") {

    var age : Int? = null
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is: $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }


    fun printInfo() {
        println("$firstName ($nickName) $lastName")
    }
}
