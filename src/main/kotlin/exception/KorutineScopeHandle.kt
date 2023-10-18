package exception
import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        val result = async {  // Coroutine that may throw an exception
        delay(100)
           // print("done")
            throw Exception("Something went wrong")
        }
      //  result.await()
        println(result)
    }
    catch (e:Exception){
        println("Caught Exception:$e")
    }
    println("After catch")

}
