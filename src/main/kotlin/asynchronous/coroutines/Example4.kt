package asynchronous.coroutines

import kotlinx.coroutines.*



fun main() = runBlocking {
    val parentJob = Job() // Create a parent Job
    val parentCoroutine = CoroutineScope(Dispatchers.Default + parentJob).launch {
        println("Parent Coroutine: Started")
        val childCoroutine1 = launch {
            repeat(30) {
                println("Child Coroutine 1: Working on task $it")
                delay(100)
            }
        }
        val childCoroutine2 = launch {
            repeat(30) {
                println("Child Coroutine 2: Working on task $it")
                delay(100)
            }
        }

        delay(250)
        println("Parent Coroutine: Cancelling all children")
        parentJob.cancel() // Cancel the parent coroutine and its children
        parentJob.join() // Wait for the parent job to complete
        println("Parent Coroutine: Completed")

    }
    parentCoroutine.join() // Wait for the parent coroutine to complete

}