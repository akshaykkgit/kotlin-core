package asynchronous.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {

    println("Main Thread:s1 ${Thread.currentThread().name}")

    runBlocking {
        println("Before calling the fetchDataFromServer()")
        val result= fetchDataFromServer()
        println("After calling the fetchDataFromServer():$result")
        println("Main Thread:s2 ${Thread.currentThread().name}")
    }
    println("Main Thread:s3 ${Thread.currentThread().name}")
    
}
suspend fun fetchDataFromServer(): String {
    delay(2000)
    return "{}"
}