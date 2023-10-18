package ranges

fun main() {

    // Closed-ended range
    println(4 in 1..4)
// true

    for (i in 1..4)
        println(i)
// 1234
    println()
    for (i in 4 downTo 1)
        println(i)
// 4321

    for (i in 0..8 step 2) print(i)
    println()
// 02468

    for (i in 8 downTo 0 step 2)
        print(i)
// 86420
    println()
    for (i in 1..9 step 3)
        print(i) // the last element is 7
// 147
    println()
    println((1..10).filter { it%2==0 })

}
