package functions

import asynchronous.thread.exec

inline fun measureTimeMillis(blocks: () -> Unit): Long {

    val startTime = System.currentTimeMillis()

    blocks()

    val endTime = System.currentTimeMillis()

    return endTime - startTime

}
inline fun doOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {

    return operation(a, b)

}


fun main() {
    val executionTime = measureTimeMillis {

        // Simulate some time-consuming operationfor (i in 1..1000000) {
        for (i in 1..10000000) {
               var c=0
               c+=1
        }
        // Do some work

    }



}
