package classes

class Person2(val name: String, val lastName: String, private var pets: MutableList<Pet> = mutableListOf()) {

    fun addPet(newPet: Pet) {
        pets.add(newPet)
    }
}