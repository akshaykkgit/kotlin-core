package classes

sealed class Result {
    val msg:String=""
    data class Success1(val data: String) : Result()
    data class Error1(val message: String) : Result()


}
fun processResult(result: Result) {
    when (result) {
        is Result.Success1 -> println("Success: ${result.data}")
        is Result.Error1 -> println("Error: ${result.message}")
    }
}
fun main() {


}

