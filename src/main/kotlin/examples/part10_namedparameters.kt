package examples


// General rules of named parameters
// 1. Mixing named and positioned parameters are not allowed.
//    If named parameters are used, ideally all positioned parameters should be named
//    This example is not allowed. 4000 is not named, so it is assumed we are giving positioned parameters
//    Position-wise, 'defect' should at third position, and come after 'inProcess'.
//    Instead, 'defect' is at second position
//    Example: totalProducts(4000, defect=20, 79)
// 2. Default parameter can be mixed with named paramater
//    Example: totalProducts(total=4000, inProcess= 79)
// 3. The order of default paramater does not really matter
//    Example: totalProducts(defect=20, total=4000, inProcess= 79)

// Java does not support named parameters
fun namedParametersExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  10 |  Named Parameters                                                                |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    // Below is not allowed
    // println(totalProducts(4000, defect=20, 79))
    println(totalProducts(total=4000, inProcess= 79))
    println(totalProducts(defect=20, total=4000, inProcess= 79))

}


fun totalProducts(total: Int, inProcess: Int, defect: Int = 0): Int {
    return total - inProcess - defect
}
