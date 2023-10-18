package iterator

fun main() {

    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }
    println()
    for (item in numbers) {
        println(item)
    }
    println()

    numbers.forEach {
        println(it)
    }

    println()

    val listIterator = numbers.listIterator()
    while (listIterator.hasNext())
        print(":${listIterator.next()}")
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }

//mutableIterator.next()
    val mutnumbers = mutableListOf("one", "two", "three", "four")
    val mutableIterator = mutnumbers.iterator()
    mutableIterator.next()
    println(mutableIterator.next())
    mutableIterator.remove()
    println("After removal: $mutnumbers")


    val numbers2 = mutableListOf("one", "four", "four")
    val mutableListIterator = numbers2.listIterator()

    mutableListIterator.next()
    mutableListIterator.add("two")
    mutableListIterator.next()
    mutableListIterator.set("three")
    println(numbers2)
}