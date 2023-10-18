package collection

import classes.Result

fun main() {


    val numbers = listOf(5, 2, 10, 4)

    val simpleSum = numbers.reduce { sum, element -> sum + element }
    println("Sum=$simpleSum")
    val sumDoubled = numbers.fold(0) { sum, element -> sum + element *2}
    println("SUM 2=$sumDoubled")
    val sumDoubledReduce = numbers.reduce { sum, element -> sum + element * 2 }
    println("SUM 3=$sumDoubledReduce")


    val numbers2 = listOf(5, 2, 10, 4)
    // same as fold but start from the end
    val sumDoubledRight = numbers2.foldRight(0) { element, sum -> sum + element * 2 }

    println(sumDoubledRight)
}