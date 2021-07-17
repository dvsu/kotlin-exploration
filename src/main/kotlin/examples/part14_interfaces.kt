package examples

// interfaces and classes do not require 'public' keyword because they are 'public' by default in Kotlin
// In Java, 'implements' keyword is required to use an interface, but not in Kotlin.
// In Kotlin, only colon operator ':' is required. See example below

fun interfacesExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  14 | Interfaces                                                                       |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val dt = DefaultDateTime()

    dt.year = 2021
    dt.month = 12
    dt.day = 31
    dt.hour = 23
    dt.minute = 59
    dt.second = 59

    val myDateTime = GlobalDateTime()

    myDateTime.setDateTime(dt)

    println(myDateTime.getDateTimeAsString())

    myDateTime.iceAgePeriod()
    myDateTime.alienPeriod()
}

interface DateTime {
    fun setDateTime(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int)
}

// below is equivalent to 'class CustomDateTime implements DateTime' in Java
class CustomDateTime : DateTime {

    // In Java, '@Override' annotation is required to override the same function/ method provided
    // by the parent class
    // In Kotlin, the same process can be done by using 'override' keyword in front of the function
    override fun setDateTime(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int) {}

}

class DefaultDateTime {
    var year: Int = 0
    var month: Int = 0
    var day: Int = 0
    var hour: Int = 0
    var minute: Int = 0
    var second: Int = 0
}

interface AlienDateTime {

    fun setDateTime(datetime: DefaultDateTime) {
        println("Inside AlienDateTime interface function")
    }

    fun alienPeriod() {
        println("Alien period: year 3,000 - 1,000,000")
    }
}

interface PrehistoricDateTime {

    fun setDateTime(datetime: DefaultDateTime) {
        println("Inside PrehistoricDateTime interface function")
    }

    fun iceAgePeriod() {
        println("Ice age period: 2.4 million years ago - 11,500 years ago")
    }
}

// Kotlin also supports multiple implementation.
// In case of multiple implementation, 'super' keyword is required to select specific interface.
// It also allows multiple 'super'
class GlobalDateTime: PrehistoricDateTime, AlienDateTime {

    var dt = DefaultDateTime()

    override fun setDateTime(datetime: DefaultDateTime) {
        super<PrehistoricDateTime>.setDateTime(datetime)
        super<AlienDateTime>.setDateTime(datetime)
        println("Inside GlobalDateTime class function")
        dt.year = datetime.year
        dt.month = datetime.month
        dt.day = datetime.day
        dt.hour = datetime.hour
        dt.minute = datetime.minute
        dt.second = datetime.second
    }

    fun getDateTimeAsString(): String {
        return "${dt.year}-${dt.month}-${dt.day} ${dt.hour}:${dt.minute}:${dt.second}"
    }
}