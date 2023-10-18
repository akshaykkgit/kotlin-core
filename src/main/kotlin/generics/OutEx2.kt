package generics

// Define a generic class with an 'out' type parameter
class Box2<out T>(private val value: T) {
    fun getValue(): T {
        return value
    }
}

fun main() {
    // mainly to produce output of the generic type. Hence very simple one could remember
    // Create a Box that produces Integer values
    val intBox: Box2<Int> = Box2(42)
    val intBox2: Box2<Number> = Box2(42)
    // Get the Integer value from the box
    val intValue: Int = intBox.getValue()
    println("Value in intBox: $intValue")
    // Attempting to assign a Box of a more specific type is allowed
    val numberBox: Box2<Number> = intBox
    // Get a Number value from the box, which is a superclass of Int
    val numberValue: Number = numberBox.getValue()
    println("Value in numberBox: $numberValue")

}