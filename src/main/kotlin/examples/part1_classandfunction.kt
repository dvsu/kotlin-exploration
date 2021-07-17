package examples

fun classAndFunctionExample() {
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

}

fun printName(name: String) {
    println(name)
}
