package exception

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/*
// A very simple way to create a CoroutineExceptionHandler to handle exceptions
    val simpleHandler = CoroutineExceptionHandler { coroutineContext,
                                                    exception ->
        println("Caught in Handler $exception")
    }
*/
class MyCoroutineExceptionHandler : CoroutineExceptionHandler {
    // Define the key property required by the CoroutineExceptionHandler
    // interface
    override val key: CoroutineContext.Key<*>
        get() = CoroutineExceptionHandler


    // The method to handle the exception
    override fun handleException(context: CoroutineContext, exception: Throwable) {
        println("Caught exception: $exception")
    }
}


// Define a suspend function that throws an exception after a delay
suspend fun task1() {
    println("In Task 1")
    delay(1000)
    throw RuntimeException("Task 1 failed")
}


// Define another suspend function that throws an exception after a delay
suspend fun task2() {
    println("In Task 2")
    delay(2000)
    throw RuntimeException("Task 2 failed")
}


fun main() = runBlocking {
    // Create an instance of our custom exception handler
    val handler = MyCoroutineExceptionHandler()

    // A very simple way to create a CoroutineExceptionHandler to handle exceptions
    val simpleHandler = CoroutineExceptionHandler { _, exception ->
        println("Caught in Handler $exception")
    }

    // Launch two coroutines that call our suspend functions and pass
    // in the exception handler
    val job1 = GlobalScope.launch(handler) {
        // Can use simpleHandler also insed of handler
        task1()
    }
    val job2 = GlobalScope.launch(handler) {
        task2()
    }


    // Wait for the coroutines to complete
    job1.join()
    job2.join()
    println("Task 1 and 2 are completed from the main")
}