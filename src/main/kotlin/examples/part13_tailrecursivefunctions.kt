package examples

import java.math.BigInteger

// Kotlin may behave like functional language by using tail recursive functions
// 'tailrec' keyword is required to use this function.
// In order to ensure the function working properly, it should have the right 'form'
// For function that performs recursively, it will benefit from using 'tailrec' function

fun tailRecursiveFunctionsExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  13 | Tail Recursive Functions                                                         |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())
    println(nthFibonacci(10, BigInteger("1"), BigInteger("0")))

    // if i value is large enough, it will cause stack overflow without the use of 'tailrec' keyword
    // println(nthFibonacci(10000, BigInteger("1"), BigInteger("0")))
    // Output example:
    //  Exception in thread "main" java.lang.StackOverflowError
    //	  at java.base/java.math.BigInteger.add(BigInteger.java:1313)
    //	  at examples.Part13_tailrecursivefunctionsKt.nthFibonacci

    // The workaround is to use 'tailrec' keyword in front of 'fun'
    println(nthFibonacci(10000, BigInteger("1"), BigInteger("0")))
}

// without 'tailrec' keyword, the processing of very big Fibonacci sequences will cause stack overflow
tailrec fun nthFibonacci(i: Int, x: BigInteger, y: BigInteger): BigInteger {
    return if (i == 0) y else nthFibonacci(i - 1, x + y, x)
}