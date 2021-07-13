package example

class Person(var Name: String) {

    fun describe() {
        println("Registered name: $Name")
    }

    fun describeUsingLambda(func: (str:String) -> Unit) {
        func(Name)
    }
}