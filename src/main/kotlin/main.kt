import examples.Person
import examples.nullSafetyExample
import examples.whenExample
import examples.exceptionExample
import examples.loopingExample


fun main(args: Array<String>) {
    println("Quick Kotlin demonstration")

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  1  |  Class and Function: Basic                                                       |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    // use 'val' keyword to make a variable immutable, i.e. cannot be reassigned
    // use 'var' keyword to make a variable mutable
    // as variable 'student' is unchanged, it is recommended to make it immutable
    val student = Person("Adam")

    // calling a function of a class
    student.describe()

    // passing a function to a class function
    student.describeUsingLambda(::printName)

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

    // Part 4: Null safety. Please see examples.part4_nullsafety.kt
    nullSafetyExample()

    // Part 5: Condition switching using 'when' expression. Please see example.part5_when.kt
    whenExample()

    // Part 6: Exception handing. Please see examples.part6_exception.kt
    exceptionExample()

    // Part 7: Looping. Please see examples.part7_looping.kt
    loopingExample()
}


fun printName(name: String) {
    println(name)
}

class StringInterp {
    val num = 256

    fun basic() {
        println("Basic string interpolation $num")
    }
}

