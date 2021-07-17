package examples

// Kotlin does not have static methods
// To create a singleton, 'object' keyword is required
// an object can have properties, methods, initializers, except constructors

fun objectExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  19 | Object                                                                           |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

//    addContinent("Australia")
//    addContinent("America")
//    addContinent("Asia")
//    addContinent("Europe")

    // alternatively, we can call the function inside object to initialize something
    Continents.initialize()

    // singleton can be accessed right away
    val targetContinent = Continents.allContinents.firstOrNull { it.name == "Europe" }
    println(targetContinent?.name)
}


fun addContinent(name: String) {
    Continents.allContinents.add(Continent(name))
}

class Continent(val name: String)

// below is a singleton
object Continents {
    var allContinents = arrayListOf<Continent>()

    // function below is not a constructor, so it has to be called to be executed
    fun initialize() {
        allContinents.add(Continent("Australia"))
        allContinents.add(Continent("America"))
        allContinents.add(Continent("Asia"))
        allContinents.add(Continent("Europe"))
    }
}