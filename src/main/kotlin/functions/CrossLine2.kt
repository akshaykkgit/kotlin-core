package functions

inline fun executeOnBackgroundThread(crossinline action: () -> Unit) {

    val thread = Thread {
        action()
    }
    thread.start()
    thread.join() // Wait for the background thread to finish.
}



fun main() {

    println("Start of main function")
    executeOnBackgroundThread {
        println("Executing on a background thread")
        // You can't use 'return' here to exit the main function.

    }
    println("End of main function")

}