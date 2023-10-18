package interview

fun findDuplicateWords(input: String): List<String> {
    val words = input.split("\\s+".toRegex()) // Split the string into words
    val wordSet = HashSet<String>()
    val duplicates = HashSet<String>()
    for (word in words)
        if (!wordSet.add(word)) { // If the word is already in the set, it's a duplicate
           duplicates.add(word)
        }
    return duplicates.toList()
}


fun main() {
    val inputString = "This is a test string. This is only a test."
    val duplicateWords = findDuplicateWords(inputString)
    if (duplicateWords.isNotEmpty()) {
        println("Duplicate words: ${duplicateWords.joinToString(", ")}")
    } else {
        println("No duplicate words found.")

    }

}