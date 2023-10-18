package asynchronous.coroutines

import kotlinx.coroutines.*





fun main() = runBlocking {
    val job = launch {
        try {
            for (i in 0..10000) {
                println(i)
                delay(100)
            }

        } catch (e: CancellationException) {
            println("Job: CancellationException caught")
        }
    }

    delay(250)
    println("Main: Cancelling the job")
    job.cancel()
//
//    job.join()
//    println("Main: Job is cancelled and completed")

}