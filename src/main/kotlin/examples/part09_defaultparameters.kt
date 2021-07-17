// By default Kotlin will generate the Java class file
// using convention {current_name}Kt.class
// for this file, the output file will be
// part9_defaultparametersKt.class
// please see out/production/kotlin_exploration/examples for
// the generated output files.
// To change the class name to be something that is
// easy to remember, we can use annotation as shown below.
@file:JvmName("MySpecialName")

package examples

fun defaultParametersExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  9  |  Default Parameters                                                              |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    println(totalCost(123.45, 12.0))
}

// 'discount' is the default parameter as it has the default value.
// the value, however, can be changed when specific value is given

// Java does not support default parameter.
// In order to use default parameter in Java, we have to use annotation
// '@JvmOverloads' to enable the default parameter
@JvmOverloads
fun totalCost(cost: Double, discount: Double = 0.0): Double {
    return cost - discount
}
