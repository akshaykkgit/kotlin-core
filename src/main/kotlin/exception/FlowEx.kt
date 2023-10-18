package exception
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.io.IOException

fun main() = runBlocking {
    val flow = flow {
        emit(1)
        emit(2)
        throw IOException("Something went wrong!")
        emit(3)
    }

    flow.catch { e ->
        emit(4) // fallback value
        println("Caught exception: $e")
    }.collect {
        println("Value: $it")
    }
}