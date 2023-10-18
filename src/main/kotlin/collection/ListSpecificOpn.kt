package collection

import kotlin.math.sign

fun main() {

    val numbers = (0..13).toList()
    val numbers22= listOf<Int>(1,2,3,2)
    println("All List=$numbers")
    println("SubList=${numbers.subList(2, 6)}")

    println("Find element positions")
    println(" Index of 2=${numbers.indexOf(2)}")
    println(" Last Index of number=${numbers22.lastIndexOf(2)}")
    println("Index of 1st")
    println(numbers.indexOfFirst { it > 2 })
    println("Index of Last")
    println(numbers.indexOfLast { it % 2 == 1 })
    val mutableList = mutableListOf("one", "two", "three", "four")
    println("\n Mutable List=$mutableList")
    println(" Binary search of two=")
    println(mutableList.binarySearch("two"))  // 3
    println(" Binary search of z=")
    println(mutableList.binarySearch("z")) // -5
    println(" Binary search of two between index")
    println(mutableList.binarySearch("two", 0, 2))  // -3

    val colors = listOf("Blue", "green", "ORANGE", "Red", "yellow")
    println(colors.binarySearch("RED", String.CASE_INSENSITIVE_ORDER)) //

    println("Compare and retirn index using Binary search")
    val productList = listOf(
        Product("WebStorm", 49.0),
        Product("AppCode", 99.0),
        Product("DotTrace", 129.0),
        Product("ReSharper", 149.0)
    )

    println(productList.binarySearch { priceComparison(it, 99.0) })

    val numbers2 = mutableListOf("one", "two", "three", "four")


    println("\n List=$numbers2")
    numbers2.sort()// wont return sorted result
    val res= numbers2.sorted()
    println("Sort into ascending: $numbers2")
    numbers2.sortDescending()

    println("Sort into descending: $numbers2")

    numbers2.sortBy { it.length }
    println("Sort into ascending by length: $numbers2")
    numbers2.sortByDescending { it.last() }
    println("Sort into descending by the last letter: $numbers2")

    numbers2.sortWith(compareBy<String> { it.length }.thenBy { it })
    println("Sort by Comparator: $numbers2")

    numbers2.shuffle()
    println("Shuffle: $numbers2")

    numbers2.reverse()
    println("Reverse: $numbers2")


    val numbers3 = listOf(6, 42, 10, 4)

    println("Count: ${numbers3.count()}")
    println("Max: ${numbers3.maxOrNull()}")
    println("Min: ${numbers3.minOrNull()}")
    println("Average: ${numbers3.average()}")
    println("Sum: ${numbers3.sum()}")


    println("\nminByOrNull")
    val numbers4 = listOf(45,5, 42, 10, 4)
    println("List=$numbers4")
    val min3Remainder = numbers4.minByOrNull { it % 3 }
    println("Result=$min3Remainder")

    println("\nmaxWithOrNull")
    val strings = listOf("one", "two", "three", "four")
    val longestString = strings.maxWithOrNull(compareBy { it.length })
    println(longestString)

    val numbers5 = listOf(5, 42, 10, 4)
    println(numbers5.sumOf { it * 2 })
    println(numbers4.sumOf { it.toDouble() / 2 })



}

data class Product(val name: String, val price: Double)

fun priceComparison(product: Product, price: Double) = sign(product.price - price).toInt()