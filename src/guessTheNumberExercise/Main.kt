package guessTheNumberExercise

import kotlin.random.Random

fun main() {
    print("1️⃣ Insert the first number: ")
    val number1: Int = readln().toInt()
    print("2️⃣ Insert the second number: ")
    val number2: Int = readln().toInt()
    val correctNumber: Int = Random.nextInt(number1, number2 + 1)

    var i = 0
    print("🤔 Try to guess the correct number: ")
    var userNumber: Int = readln().toInt()
    i++
    while (correctNumber != userNumber) {
        print("❌ The number $userNumber it's not the correct number ")
        val lessOrGreater = if (userNumber > correctNumber) "greater" else "less"
        println("and $userNumber is $lessOrGreater than the number to guess")

        print("🤔 Try to guess the correct number: ")
        userNumber = readln().toInt()
        i++
    }

    println("🎉🎉🎉 You guessed it! The number $userNumber is the correct number")
    if (i == 1) print("🔥 You guessed in 1 try, kudos") else print("👏 You guessed in $i tries")
}