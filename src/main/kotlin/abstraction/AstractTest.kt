package abstraction
// Define an abstract class called Vehicle
fun main() {
    val c=Car()
    c.start()
    println( c.concreateFun())
}

abstract class Vehicle {
    abstract fun start()
    abstract fun stop()
    abstract val cc:String
    fun concreateFun():String="Concreate Value"
}

// Create specific vehicle classes that inherit from Vehicle
class Car : Vehicle() {
    override fun start() {
        println("Car started")
    }
    override fun stop() {
        println("Car stopped")
    }

    override val cc: String
        get() = "1000cc"

}



class Motorcycle : Vehicle() {
    override fun start() {
        println("Motorcycle started")
    }

    override fun stop() {
        println("Motorcycle stopped")
    }

    override val cc: String
        get() = "350cc"
}



class Truck : Vehicle() {
    override fun start() {
        println("Truck started")
    }

    override fun stop() {
        println("Truck stopped")
    }

    override val cc: String
        get() = "5000cc"
}