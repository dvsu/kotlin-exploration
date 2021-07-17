package examples

// Creating a new function or utility classes may increase complexity.
// To improve this, Kotlin supports extension function, i.e.
// creating a function that is part of a class that is not owned by us
// Kotlin then will generate a static function


fun extensionFunctionsExamples() {

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  11 |  Extension Functions                                                             |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val originalText = "The United    States   of America"
    // traditional way using a function
    println(removeWhiteSpace(originalText))

    // using extension function. See the difference in calling both functions
    println(originalText.removeWhiteSpaceExtended())
}

// traditional utility function to perform specific process
fun removeWhiteSpace(value: String):String {
    return Regex("\\s+").replace(value, "")
}

// instead, we can create an extended function for String class
fun String.removeWhiteSpaceExtended(): String {
    // the input is 'this'
    return Regex("\\s+").replace(this, "")
}
