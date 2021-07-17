package examples

// Data classes are typically immutable

fun dataClassesExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  18 | Data Classes                                                                     |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    // By default, comparing two classes, even with the same attribute value will return inequality.
    // The reason is because both have different reference
    val country1 = Country("Canada")
    val country2 = Country("Canada")

    if (country1 == country2) {
        println("Both countries are equal")
    } else {
        println("Both countries are not equal")
    }

    // The workaround is to convert the class into data class
    val city1 = City("Toronto")
    val city2 = City("Toronto")

    if (city1 == city2) {
        println("Both cities are equal")
    } else {
        println("Both cities are not equal")
    }

    // Data class also provides string representation
    // Observe the difference when both classes are printed
    println(country1)
    println(city1)

    // Data class also provides 'copy' method
    val city3 = city2.copy(name="New York")
    println(city3)
}

class Country(val capital: String)

data class City(val name: String)
