package exception

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    getNumbers()
        .onStart { println("Started emitting numbers...") }
        .onCompletion { println("Finished emitting numbers.") }
        .catch { e -> println("Caught exception: $e") }
        // .onErrorResumeNext { e -> emitAll(getFallbackNumbers()) }  // This depricated
        .collect { println("Received number: $it") }
}


fun getNumbers(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(100)
        emit(i)
        if (i == 3) throw Exception("Error emitting number 3")
    }
}


fun getFallbackNumbers(): Flow<Int> = flow {
    emit(100)
    emit(200)
    emit(300)
}