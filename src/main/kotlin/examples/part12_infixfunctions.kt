package examples

// infix function can be used to make syntax simpler
// we will compare a few approaches to solve the same problem
// below we will combine two different strings into a single string

fun infixFunctionsExample() {

    println("""
    .-----.----------------------------------------------------------------------------------.
    |  12 |  Infix Functions                                                                 |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    val firstContent = StoryContent("\\“Harvest is ended and summer is gone,\\” " +
            "quoted Anne Shirley, gazing across the shorn fields dreamily. ")
    val secondContent = StoryContent("She and Diana Barry had been picking apples in the Green Gables orchard, " +
            "but were now resting from their labors in a sunny corner, " +
            "where airy fleets of thistledown drifted by on the wings of a wind that was " +
            "still summer-sweet with the incense of ferns in the Haunted Wood.")

    // the traditional approach
    val allContentTraditional = firstContent.plus(secondContent)
    println(allContentTraditional.Content)

    // alternative approach using infix. The syntax is much simpler now
    val allContentInfix = firstContent plus secondContent
    println(allContentInfix.Content)

    // or, we can also use operator overloading to perform the same operation
    // though operator overloading should not be overused to prevent confusion
    val allContentOpOvld = firstContent + secondContent
    println(allContentOpOvld.Content)
}


class StoryContent(var Content: String) {}

// to enable the infix function, the prefix 'infix' must be added in front 'fun'
// to enable operator overloading, the prefix 'operator' must be added in front 'fun'
infix operator fun StoryContent.plus(newContent: StoryContent): StoryContent {
    return StoryContent((this.Content + newContent.Content).replace("\\",""))
}