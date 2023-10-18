package exception

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val supervisorJob = SupervisorJob()
    val supervisorScope = CoroutineScope(coroutineContext + supervisorJob)

    val job1 = supervisorScope.launch(CoroutineExceptionHandler { _, e ->
        println("Coroutine 1 failed: $e")
    }) {
        delay(100)
        throw RuntimeException("Coroutine 1 failed")
    }

    val job2 = supervisorScope.launch(CoroutineExceptionHandler { _, e ->
        println("Coroutine 2 failed: $e")
    }) {
        delay(2000)
        throw RuntimeException("Coroutine 2 failed")
    }

    supervisorScope.launch {
        job1.join()
        job2.join()
        println("All coroutines completed")
    }
}