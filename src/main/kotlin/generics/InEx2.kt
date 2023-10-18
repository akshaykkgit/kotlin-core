package generics

// Define a generic class with an 'in' type parameter
class Box3<in T>(private var value: T) {
    fun setValue(newValue: T) {
        value = newValue
    }

}



fun main() {
    //t is mainly consuming the generic type. Hence very simple one could remember
    // Create a Box that accepts Number (superclass of Int)
    val numberBox: Box3<Number> = Box3(10)
    // Assign a new Integer value (subclass of Number)
    numberBox.setValue(20)
    // Attempting to assign a Double value (subclass of Number) would work as well
    val doubleBox: Box3<Number> = Box3(3.14)
    doubleBox.setValue(2.71)
    // This is not allowed because 'Box<Number>' is a supertype of 'Box<Int>'
    // val intBox: Box<Int> = numberBox // Error: Type mismatch
    // However, you can use the 'Box<Number>' reference to set an Integer value
    (numberBox as Box3<Int>).setValue(30)

}