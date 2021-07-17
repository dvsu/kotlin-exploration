package examples

// we will again solve the Fibonacci sequence, but instead of using the Object-Oriented style,
// we will solve it using functional style (lambda function) to simplify the code

fun higherOrderFunctionsExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  23 | Higher Order Functions                                                           |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    val sequence = Sequence2()
    var total = 0

    // first syntax style
    // sequence.fibonacci(10, {s -> println(s)})
    // second syntax style, preferred
    // sequence.fibonacci(10) {s -> println(s)}

    // Kotlin has default parameter name for lambda function, 'it'
    // as the lambda function only passes 1 parameter, it can be further simplified as shown below.
    // sequence.fibonacci(10) {println(it)}

    // alternatively using function reference
    // sequence.fibonacci(10, ::println)

    // Kotlin lambdas can mutate values, as opposed to 'final' value in Java
    // in Java, the 'total' variable must be 'final' but it is mutable in Kotlin
    sequence.fibonacci(10) {
        println(it)
        total += it
    }

    println("Total $total")
}

class Sequence2 {

    fun fibonacci(count: Int, action: (Int) -> Unit) {
        var prev = 0
        var temp: Int
        var current = 1

        for(i:Int in 1..count) {
            action(current)

            temp = current
            current += prev
            prev = temp
        }
    }
}