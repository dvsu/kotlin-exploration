package examples

import java.lang.NumberFormatException

fun exceptionExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  6  |  Exception handling                                                              |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    // try-catch block

    val myWord = "notanumber"

    val myOutput: Int? = try {
        // this will fail because a string word is passed to 'myWord'. Expected number string
        myWord.toInt()
    } catch (e: NumberFormatException) {
        null
    }
    // can also be chained with optional 'finally' block to guarantee end block execution

    println("My output is $myOutput")
}