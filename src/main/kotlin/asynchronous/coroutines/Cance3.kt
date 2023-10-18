package asynchronous.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            println("launch")
            withTimeout(1000) {
                delay(2000)
            }
        } catch (e: TimeoutCancellationException) {
            println("Timeout Exaception")
        }
    }

}