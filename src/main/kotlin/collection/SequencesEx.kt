package collection

fun main() {
    val numbersSequence = sequenceOf("four", "three", "two", "one")

    val numbers = listOf("one", "two", "three", "four")
    val numbersSequence2 = numbers.asSequence()

    val oddNumbers = generateSequence(1) { it + 2 }
    println(oddNumbers)
    println(oddNumbers.take(5).toList())

    val oddNumbersLessThan10 = generateSequence(1) { if (it < 8) it + 2 else null }
    println(oddNumbersLessThan10.count())


    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(2)

    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)

    val sequence = sequence {
        val start = 0
        // yielding a single value
        yield(start)
        // yielding an iterable
        yieldAll(1..5 step 2)
        // yielding an infinite sequence
        yieldAll(generateSequence(8) { it * 3 })
    }

    println(sequence.take(7).toList()) // [0, 1, 3, 5, 8, 24, 72]
}