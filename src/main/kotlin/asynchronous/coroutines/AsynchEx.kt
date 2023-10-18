package asynchronous.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main():Unit= runBlocking {
    val db1=async { loadDataFromDB1() }
    val db2=async { loadDataFromDB2() }
    val results=db1.await()+db2.await()
    results.forEach { str-> println(str) }

}
private suspend fun loadDataFromDB1():List<String>{
    delay(5000)
    return listOf("a","b","c")
}
private suspend fun loadDataFromDB2():List<String>{
    delay(5000)
    return listOf("apple","ball","cup")
}