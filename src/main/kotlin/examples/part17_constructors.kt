package examples

// there is no 'new' keyword in Kotlin
// Kotlin supports multiple constructors, named primary and secondary constructors.
// The constructor will be chosen, depending on the parameters that are passed to the class during initialization
// The constructors are part of class definition, e.g. class MyClass(...)
// Kotlin also supports private constructors. The common use of it is to create a singleton

fun constructorsExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  17 | Constructors                                                                     |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    // this will call the first constructor
    val myPhone = Smartphone("Apple", "iPhone X", "32bv4vh87")
    println("My phone is ${myPhone.brand} ${myPhone.modelName} with serial number ${myPhone.serialNumber}")

    // this will call the second constructor
    val yourPhone = Smartphone("Google", "Pixel 4a", "v3b478fjf", 2021)
    println("Your phone is ${yourPhone.brand} ${yourPhone.modelName} with serial number ${yourPhone.serialNumber}, made in ${yourPhone.yearMade}")
}


abstract class Phone(val serialNumber: String)

// Primary constructor: Method 1, secondary constructor: Method 1 (yearMade is part of secondary constructor, by giving it a default value)
class Smartphone(val brand: String, val modelName: String, serialNumber: String, var yearMade: Int = 0): Phone(serialNumber)

// Primary constructor: Method 2
//class Smartphone(_brand: String, _modelName: String): Phone() {
//    val brand = _brand
//    val modelName = _modelName
//}

// Primary constructor: Method 3
//class Smartphone(brand: String): Phone() {
//    val brand: String
//
//    init {
//        this.brand = brand
//    }
//}

// Primary constructor: Method 1, secondary constructor: Method 2
//class Smartphone(val brand: String, val modelName: String, serialNumber: String): Phone(serialNumber) {
//
//    var yearMade: Int = 0
//    // Alternatively, user may give additional parameter. In this case, secondary constructor is required
//    constructor(brand: String, modelName: String, serialNumber: String, yearMade: Int) : this(brand, modelName, serialNumber) {
//        this.yearMade = yearMade
//    }
//}