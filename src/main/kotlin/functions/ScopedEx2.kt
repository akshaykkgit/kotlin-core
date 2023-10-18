package functions

fun main() {
    var a = 1
    var b= 2

    a = a.also {
        it + 2
    }.also {
        val i = it + b
        i}
    println(a) //5
}