package examples

import java.util.*

fun loopingExample() {
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