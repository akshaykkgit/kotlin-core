package lambdas
//Higher order
fun executeFunction(action: () -> Unit) {

    println("Executing the provided function...")
    action()

}
fun adds(a: Int, b: Int): Int {
    return a + b
}
fun returnMeAddFunction(): ((Int, Int) -> Int) {
    // can do something and return function as well
    // returning function
    return ::adds
}


fun main() {

    // Define a lambda function to be passed as a parameter

    val myFunction = {

        println("This is the function being executed.")

    }
    // Call the higher-order function and pass the lambda function as an argument
    executeFunction(myFunction)

    val add = returnMeAddFunction()
    val result = add(2, 2)
    println("Sum=$result")

}