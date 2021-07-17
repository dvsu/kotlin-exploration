package examples

fun conditionalExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  3  |  Conditional statement                                                           |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val notQuiteTernary = true
    val ternMessage = if (notQuiteTernary) "Not really a ternary operator" else "This is ternary"
    println(ternMessage)

    val result = 25
    val threshold = 30
    val currentValue = if (result < threshold) {
        println("Within safe range")
        result
    } else {
        println("Out of range")
        threshold
    }
    println("Current value is $currentValue")
}