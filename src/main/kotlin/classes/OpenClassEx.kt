package classes

open class Animal() {
    val name:String=""
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {

    override fun makeSound() {
        println("Dog barks")
    }

}
