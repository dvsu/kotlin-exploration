package examples

fun functionExpressionExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  8  |  One-Line Function/ Function Expression                                          |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    println(min(12, 34))
    println(min(34587, 1231))
}

// Single liner in Kotlin
fun min(a: Int, b: Int): Int = if (a < b) a else b
