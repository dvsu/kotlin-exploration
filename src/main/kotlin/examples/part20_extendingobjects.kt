package examples

// objects can derive from other classes/ interfaces
// object can also be nested inside a class to limit the scope

fun extendingObjectsExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  20 | Extending Objects                                                                |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    println(RootVegetable.name)
}


abstract class Vegetable(val name: String)

object RootVegetable : Vegetable("Carrot")


class Fruit {

    object LargestFruit
}