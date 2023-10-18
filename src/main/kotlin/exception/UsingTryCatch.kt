package exception

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        try {
            // do something that may throw an exception
            println("Inside coroutine")
            throw RuntimeException("Exception in coroutine")
        } catch (e: Exception) {
            // handle the exception here
            println("Caught exception: ${e.message}")
        }
    }
    Thread.sleep(1000) // wait for the coroutine to complete
}