package exception

import kotlinx.coroutines.*



fun main() = runBlocking {
    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        println("Caught exception: $exception")
    }

    val job = GlobalScope.launch(exceptionHandler) {
        launch { // Child coroutine
            val r=1/0
        }
    }
   // job.join()
    delay(3000)
    println("Main")

}

