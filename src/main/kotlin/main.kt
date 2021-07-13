import example.Person
import java.lang.NumberFormatException
import java.util.*

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

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  4  |  Null safety                                                                     |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    // By default, Kotlin always prevents null assignment to any data types
    var myNumber: Int = 3

    // Assign null to a variable will cause an error. Below is invalid
    // myNumber = null

    // To explicitly assign a null to a variable, the data type has to be followed by a question mark ?
    var iAcceptNull: Int? = null

    // class can be made nullable as well
    var storage:NumberStorage? = null

    // To get the value of "secretNumber", safe operator '?' is required to check the nullity of "storage".
    // If "storage is null, don't perform the operation
    storage?.numberMultiplier()

    // Let's assign the storage and call the same class function again
    storage = NumberStorage()

    // as 'storage' is assigned with a value, safe operator is not required anymore
    val mulNumber = storage.numberMultiplier()
    println(mulNumber)

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
    } catch (e:NumberFormatException) {
        null
    }
    // can also be chained with optional 'finally' block to guarantee end block execution

    println("My output is $myOutput")

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  7  |  Looping                                                                         |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    // Kotlin doesn't have traditional for loop such as 'for (int i = 0; i < 10; i++) {}'
    println("Inclusive 'for' loop using '..'")
    for(n in 1..10) {
        println(n)
    }

    println("Using 'step' keyword to increment from 1 to 10, every step of 3")
    for(n in 1..10 step 3) {
        println(n)
    }

    println("Backward from 10 to -3, decrement of 3")
    for(n in 10 downTo -3 step 3) {
        println(n)
    }

    println("Half-close range 'for' loop from 1 to 9, using 'until' keyword")
    for(n in 1 until 10){
        println(n)
    }

    // for can be used to access collection such as TreeMap, similar to accessing dictionary in Python
    val itemIds = TreeMap<String, Int>()
    itemIds["iPhone12"] = 12345
    itemIds["Pixel4a"] = 4567
    itemIds["GalaxyS21"] = 2145

    for((item, id) in itemIds) {
        println("ID of $item is $id")
    }

    // or add indexing capability, similar to enumerate() in Python
    for((index, element) in itemIds.keys.withIndex()) {
        println("Index $index = $element")
    }

    // range of characters is also valid
    val myChars = 'a'..'e'

    for(char in myChars) {
        println(char)
    }

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

class NumberStorage {

    fun numberMultiplier(): Int {
        val secretNumber = 36
        println("Number is multiplied")
        return secretNumber * 2
    }
}