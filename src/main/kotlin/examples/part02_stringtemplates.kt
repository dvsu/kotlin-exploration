package examples

fun stringTemplatesExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  2  |  String templates/ interpolation                                                 |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val strp = StringInterp()

    // Basic string interpolation
    strp.basic()

    // or alternatively using curly braces for compound variable
    println("Alternatively ${strp.num}")

}

class StringInterp {
    val num = 256

    fun basic() {
        println("Basic string interpolation $num")
    }
}

