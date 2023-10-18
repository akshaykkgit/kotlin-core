package delegation

import kotlin.reflect.KProperty

class Example {

    var customValue: String by CustomDelegate()

}
 class CustomDelegate {

    private var backingField = "Default"
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Getting value: $backingField")
        return backingField
    }


    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("Setting value: $value")
        backingField = value
    }

}





fun main() {
    val example = Example()

    example.customValue = "New Custom Value"
    println(example.customValue)

    val lazyValue: String by lazy {
        println("Computed!")
       "Hello, Lazy!"
    }

// Accessing lazyValue will initialize it on the first access
    println(lazyValue)
}