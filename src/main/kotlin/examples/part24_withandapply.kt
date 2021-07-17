package examples

// let's compare variable assignment using traditional way vs. 'with' vs. 'apply'

fun withAndApplyExample(){

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  24 | With and Apply                                                                   |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val pc1 = Computer()
    pc1.CPUMaker = "Intel"
    pc1.CPUModel = "i5 9400"
    pc1.RAMSize = 8
    pc1.RAMUnit = "GB"
    pc1.confirm()

    val pc2 = Computer()

    with(pc2) {
        CPUMaker = "Intel"
        CPUModel = "i9 11900F"
        RAMSize = 8
        RAMUnit = "GB"
    }
    pc2.confirm()

    val pc3 = Computer()

    pc3.apply {
        CPUMaker = "AMD"
        CPUModel = "Ryzen 5600"
        RAMSize = 16
        RAMUnit = "GB"
    }.confirm()

}

class Computer {
    var CPUMaker: String = ""
    var CPUModel: String = ""
    var RAMSize: Int = 0
    var RAMUnit: String = ""

    fun confirm(){
        println("PC specs: CPU: $CPUMaker $CPUModel RAM: $RAMSize$RAMUnit")
    }
}