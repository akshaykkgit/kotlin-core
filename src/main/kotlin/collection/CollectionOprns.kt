package collection

fun main() {

    //filter

    val numbers = listOf("one", "two", "three", "four")
    val numbers2 = listOf("one", "one")
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val mixedData = listOf(null, 1, "two", 3.0, "four")
    val numbersWithNull = listOf(null,"one", "two", "three", "four")
    val filterResults = mutableListOf<String>()
    val filterResults2 = mutableListOf<String>()
    val  mutableNumbersMap = mutableMapOf("one" to 1, "two" to 2)

    val longerThan3 = numbers.filter { it->it.length>3 }
    val filMap=numbersMap.filter { (key,value)-> key.endsWith("1") && value>10 }
    val filterIndexed=numbers.filterIndexed { index,it -> (index!=0) && (it.length<5) }
    val filterNot=numbers.filterNot { it -> (it.length<5) }

    val nonNullVals=numbersWithNull.filterNotNull()
    val (match,rest) = numbers.partition { it.length>3 }
    numbers.filterTo(filterResults) { it.length > 3 }
    // thus eliminating duplicates in the result
    val hashResult = numbers.mapTo(HashSet()) { it.length }
    mutableNumbersMap.put("three", 3)
    mutableNumbersMap.putAll(setOf("four" to 4, "five" to 5))
    mutableNumbersMap["six"]=6
    mutableNumbersMap += setOf("seven" to 7)


    println("Filtered=$longerThan3")
    println("Filterd Map=$filMap")
    println("Filterd Index=$filterIndexed")
    println("Filterd Not=$filterNot")
    println("Filter Strings")
    mixedData.filterIsInstance<String>().forEach(
        {
            println(it)
        }
    )
    println("Non Null values=$nonNullVals")
    println("\n Partition \n Matched=$match\nRest=$rest")
    println("\n Predicate Test")
    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("z") })
    println(numbers2.all { it.endsWith("e") })
    println("\nFiltered Result=$filterResults")
    numbers.filterIndexedTo(filterResults2)
    { index, it -> index == 0 }
    println("Filtered Result 2=$filterResults")
    println("Hashmap modified =$mutableNumbersMap")
    mutableNumbersMap.remove("three")
    println("after removing 3 =$mutableNumbersMap")
    mutableNumbersMap.remove("two",2) //wont remove if value doest match
    println("after removing 2 =$mutableNumbersMap")
    mutableNumbersMap-="one"
    println("after removing 1 =$mutableNumbersMap")

    val numberSet = setOf("one", "two", "three")
    println("Set 1=$numberSet")
    print("Union 1:")
    println(numberSet union setOf("four", "five"))
    print("Union 2:")
    println(setOf("four", "five") union numberSet)
    print("Intersection")
    println(numberSet intersect setOf("two", "one"))
    print("Sustract 1")
    println(numberSet subtract setOf("three", "four"))
    print("Sustract 2")
    println(numberSet subtract setOf("four", "one"))

    println("\n List unition and intersection")
    val list1 = listOf(1, 1, 2 ,3, 5, 8, -1)
    val list2 = listOf(1, 1, 2, 2 ,3, 5)
    println("intersection")
    println(list1 intersect list2) // result on two lists is a Set
    println("union")
    println(list1 union list2)







}