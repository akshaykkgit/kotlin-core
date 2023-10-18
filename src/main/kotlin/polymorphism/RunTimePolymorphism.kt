package polymorphism

fun main() {
    val dog:Animal=Dog() // Calls Dog's makeSound() method at runtime
    dog.makeSound()
}


open class Animal {
        open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}
