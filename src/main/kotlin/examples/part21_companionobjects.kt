package examples

// we can use a companion object to create a static method in Kotlin
// companion object has 2 purposes:
//   1. add static member to a class
//   2. used as factory object within a class


fun companionObjectsExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  21 | Companion Objects                                                                |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    OS.updateOSVersion("1.1.8")

    // see how we call the method on the class, not from the instance of class, as if it is a static method
    val myCar = Car.addSUVCar("Ford", "USA")
    val yourCar = Car.addSportCar("Ferrari", "Italy")
    println(myCar.maker)
    println(yourCar.origin)
}

// as static method
class OS {
    companion object {
        fun updateOSVersion(version: String) {}
    }
}


// as factory method
open class Car(maker: String, origin: String, yearMade: Int): Vehicle(maker, origin, yearMade) {
    companion object {
        fun addSportCar(maker:String, origin: String): SportCar{
            return SportCar(maker, origin)
        }
        fun addSUVCar(maker: String, origin: String): SUVCar{
            return SUVCar(maker, origin)
        }
    }
}

class SportCar(maker: String, origin: String) : Car(maker, origin, 2021)

class SUVCar(maker: String, origin: String): Car(maker, origin, 2019)

open class Vehicle(val maker: String, val origin: String, val yearMade: Int)