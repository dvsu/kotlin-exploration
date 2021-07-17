package examples

// In Kotlin, class is 'public' and 'final' by default
// The class function is also 'final' by default
// To override the class function, the 'open' or 'abstract' keyword must be used in front of function
// Similarly, 'open' or 'abstract' keyword is required to inherit from a super class

fun classesExample() {

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  15 | Classes                                                                          |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val myCat = Cat()

    println("My cat is a pet: ${myCat.animalCategory()}")
    println("Its name is ${myCat.getName()}")
}


abstract class Animal {
    private var isPet: Boolean = false
    open var animalName: String = "Unknown"
    private var animalType: String = "Unknown"

    open fun getName(): String = "$animalName the $animalType"

    // class function can be set as abstract and body-less
    abstract fun animalCategory(): Boolean
}

// Cat class below is equivalent to 'class Cat extends Animal' in Java
class Cat : Animal() {

    override fun getName(): String {
        return "Felix the Cat"
    }

    override fun animalCategory(): Boolean {
        return true
    }
}