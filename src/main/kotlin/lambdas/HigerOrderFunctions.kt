package lambdas

//import Animal
//import com.akshay.classes.AnimalJava

/*

In Kotlin higher order functions are the functions that can take other function
as parameter or return function as their results.

They enable more functional programming style




 */
fun main() {

    val sum = applyOperation(5, 6, ::add)
    println("Sum=$sum")

    val sub = applyOperation(4, 2, ::sub)
    println("Sub=$sub")

    val mul: (Int, Int) -> Int = { a, b -> a * b }

    val mulval= applyOperation(2,6,mul)

    println("Mul=$mulval")



}

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}
