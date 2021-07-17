package examples

// Object-Oriented implementation to solve Fibonacci sequence using anonymous interface
// to create separation of concern between the calculation and process/ strategy

fun anonymousClassesExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  22 | Anonymous Classes                                                                |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    val sequence = Sequence()

    // use 'object' keyword to pass an anonymous class/ interface
    sequence.fibonacci(10, object:Process{
        override fun run(value: Int) {
            println(value)
        }
    })
}


interface Process {
    fun run(value: Int)
}

class Sequence {

    fun fibonacci(count: Int, action: Process) {
        var prev = 0
        var temp: Int
        var current = 1

        for(i:Int in 1..count) {
            action.run(current)

            temp = current
            current += prev
            prev = temp
        }
    }
}