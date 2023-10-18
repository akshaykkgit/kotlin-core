package asynchronous.callback

// Define a function that simulates an asynchronous task, such as fetching data from a network.

fun fetchDataFromNetwork(callback: (result: String) -> Unit) {
    // Simulate a delay to mimic a network request.
    Thread.sleep(4000) // Sleep for 2 seconds
    // Once the data is fetched, call the callback function with the result.
    val data = "Data from the network"
    callback(data)
}

fun fetchDataFromNetwork2(callback: (result: String) -> Unit) {
    // Simulate a delay to mimic a network request.
    Thread.sleep(4000) // Sleep for 2 seconds
    // Once the data is fetched, call the callback function with the result.
    val data = "Data from the network2"
    callback(data)
}

fun main() {
    println("Start of the program")
    val startTime=System.currentTimeMillis()
    fetchDataFromNetwork { result ->
        // This code block will be executed when the asynchronous task is completed.
        println("Received data: $result")
    }
    fetchDataFromNetwork2 { result ->
        // This code block will be executed when the asynchronous task is completed.
        println("Received data 2: $result")
    }
    println("End of the program")
    val endTime=System.currentTimeMillis()
    val total=endTime-startTime
    println("completd in $total sec")
}