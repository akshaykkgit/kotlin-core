package asynchronous.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Main Thread starts")
    GlobalScope.launch {
        println("Coroutine start doing some work.")
        delay(2000)
        println("Coroutine : work is done.")
    }
    //continue executing the delegation.main thread
    println("Main Thread continues")
    //ading delay so that delegation.main thread will not complete before coroutines complete
    //this delay will help coroutine to work
    //this delay will help coroutine to work
    runBlocking {
        delay(3000)
    }
    println("Main thread ends.")

}