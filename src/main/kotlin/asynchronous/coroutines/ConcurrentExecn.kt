package asynchronous.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        println("Before fetching data from the Server.")
        val data1Deferred = async { fetchFromServer1() }
        val data2Deferred = async { fetchFromServer2() }

        val data1 = data1Deferred.await() //wait for the data from server 1
        val data2 = data2Deferred.await() //wait for the data from server 2

        println("Data from Server 1:$data1")
        println("Data from Server 2:$data2")

    }

}
suspend fun fetchFromServer1():String{
    delay(4000)
    return "Data from Server 1"
}
suspend fun fetchFromServer2():String{
    delay(2000)
    return "Data from Server 2"
}

