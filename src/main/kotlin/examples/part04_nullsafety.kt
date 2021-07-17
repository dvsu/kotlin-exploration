package examples

fun nullSafetyExample() {
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

}

class NumberStorage {

    fun numberMultiplier(): Int {
        val secretNumber = 36
        println("Number is multiplied")
        return secretNumber * 2
    }
}