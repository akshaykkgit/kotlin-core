package exception

import kotlinx.coroutines.*

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { coroutineContext, exception ->
        println("Caught in Handler: $exception")
    }

    supervisorScope {
        val deferred1 = async(handler) {
            println("Task 1 started")
            delay(1000)
            println("Task 1 completed")
            throw RuntimeException("Task 1 failed")
        }
        val deferred2 = async(handler) {
            println("Task 2 started")
            delay(2000)
            println("Task 2 completed")
        }

        try {
            deferred1.await()
            deferred2.await()
        } catch (ex: Exception) {
            println("Caught in supervisorScope: $ex")
        }
    }
}