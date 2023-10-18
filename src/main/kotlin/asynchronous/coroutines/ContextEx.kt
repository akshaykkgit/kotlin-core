package asynchronous.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
fun main() {
    // Define a coroutine context using Dispatchers
    println("Running on 1${Thread.currentThread().name}")
    val context = Dispatchers.IO
    // Launch a coroutine within the defined context
    val job = GlobalScope.launch(context) {
        // Coroutine code here
        println("Running on 2 ${Thread.currentThread().name}")
    }
 // Wait for the coroutine to complete
    runBlocking {
        println("Running on 3 ${Thread.currentThread().name}")
        job.join()
    }
}


/*

Coroutine context is a fundamental concept in Kotlin's coroutine framework, used to manage the execution
context or environment in which coroutines run. It provides crucial information such as the dispatcher
 (thread or thread pool) on which a coroutine should execute and other context elements.

We define a coroutine context (context) using Dispatchers.Default, which indicates that the
 coroutine will run on a background thread from the default thread pool.

We launch a coroutine (job) within this context. Inside the coroutine,
 we print the name of the thread it's running on.

We use runBlocking to block the main thread temporarily and wait for the job coroutine to complete.

The key takeaway is that coroutine context allows you to specify where a coroutine should run,
 and you can change the context to control its execution environment, whether on the main thread,
  a background thread, or custom contexts as needed.
        */
