package asynchronous.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println(" Satrted Thead ${Thread.currentThread().name}")
    runBlocking {
        try {
            println(" Started Thead ${Thread.currentThread().name}")
            val st=System.currentTimeMillis()
            val result = coroutineScope {
                val job1= launch {
                    println("corutine 1 is running")
                    println("Started Thead ${Thread.currentThread().name}")
                    delay(4000)
                    println("coroutine 1 is done")

                }
                val job2= launch {
                    println("corutine 2 is running")
                    println("Started Thead ${Thread.currentThread().name}")
                    delay(4000)
                    println("coroutine 2 is done")
                }
                job1.join()
                job2.join()
                println("All corutine are completed")
            }
            val en=System.currentTimeMillis()
            val tot=en-st
            println("Tot=$tot")
            println(result)

        }
        catch (e:Exception){

        }
    }
}


/*

We use the runBlocking coroutine builder to create a coroutine that blocks the main thread until
all its child coroutines are complete. This is often used in main functions to launch coroutines.

Inside the runBlocking block, we create a coroutine scope using the coroutineScope builder.
This establishes a scope for concurrent coroutines, and it's structured in a way that if any

of the launched coroutines within it fail, the coroutineScope will automatically cancel all
 remaining coroutines.

Within the coroutineScope, we launch two concurrent coroutines using the launch builder.
 These coroutines simulate asynchronous tasks with delays.

We use the join function on both job1 and job2 to wait for them to complete.
This ensures that we don't proceed until both coroutines are finished.

Finally, we print "All coroutines are completed" after both coroutines have successfully finished.

If an exception occurs within any of the launched coroutines, it will be caught in the try-catch block, and we'll handle it appropriately. This demonstrates how coroutineScope helps in managing concurrent tasks while providing structured error handling.*/
