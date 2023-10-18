package abstraction

interface InterfaceAbstraction {
     fun start()
     fun stop()
     fun concreteFun():String="Some concrete value"
     val dualTone:Boolean
}
interface ColorInterface {
    fun clour()
}
class Car1 : InterfaceAbstraction,ColorInterface {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car started")
    }

    override val dualTone: Boolean
        get() = true

    override fun clour() {
        println("Colour is Red")
    }

}