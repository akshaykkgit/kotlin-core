package asynchronous.coroutines
import kotlinx.coroutines.*

fun main() {
    val job = GlobalScope.launch {
        for (i in 0..1000000)
            println(i)
    }
    // cancel the coroutine
    job.cancel()
    //Calling cancel will immediately stop the coroutine and prevent it from executing any further.
}