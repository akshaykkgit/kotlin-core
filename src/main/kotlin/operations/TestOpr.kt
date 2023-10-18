package operations

fun main() {

    // primitive example
    val int1 = 10
    val int2 = 10
    println(int1 == int2) // true
    println(int1 === int2) // true
// wrapper example
    val num1 = Integer(10)
    val num2 = Integer(10)
    println(num1 == num2) // true
    println(num1 === num2) //false
}