package examples

fun whenExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  5  |  When expression                                                                 |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    // 'when' expression is similar to 'switch' in other languages

    when ("Spain") {
        "Spain" -> println("in Europe")
        "Canada" -> println("in North America")
        "Japan" -> println("in Asia")
        else -> println("Unknown location")
    }
}