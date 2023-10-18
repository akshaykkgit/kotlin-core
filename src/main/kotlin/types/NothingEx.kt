package types

fun throwError(message: String): Nothing {
    throw IllegalArgumentException(message)
}



fun infiniteLoop(): Nothing {
    while (true) {
        // This function never returns
    }
}



fun main() {
    infiniteLoop()

    val isError = true
    val result: String = if (isError) {
        throwError("An error occurred") // This function returns Nothing
    } else {
        "No error" // This is a regular String
    }
    println(result)

}