package exception

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun flowExceptionExample()= runBlocking{


        getDataFlow()
            .onEach {
                check(it<3){
                    println("Invalid Value ")
                    "i>3"
                }

            }
           // .handleError()
                //or
            .catch {
                println("Exception :${it.message}")
            }
            .collect()

}

/*
private fun <T> Flow<T>.handleError() = flow {

try {
    collect{ emit(it) }
} catch (e: Exception) {
    println("Caught ex: ${e.message}")
}
}
*/

fun getDataFlow() = flow<Int> {
    for (value in 1..3) {
        println("Printing value :$value")
        emit(value)
    }
}
fun main() {
    flowExceptionExample()
}