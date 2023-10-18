package functions

fun main() {
    println("START..")
    teach()
    println("...END")
    val result = doOperations(5, 3) { x, y -> x + y }

    println("Result: $result")


}
inline fun teach(){
    println("teaching inlin")

}
inline fun doOperations(a: Int, b: Int, operation: (Int, Int) -> Int): Int {

    return operation(a, b)

}
