package delegation

interface Engine {
    fun start()
    fun end()


}

class gasEngine : Engine {
    override fun start() {
        println("Gas engine started")
    }

    override fun end() {
        println("Gas engine stoped")
    }
}

class Car(private val engine: Engine) : Engine by engine {

}

interface DelegateIntr {
    val value: String
    fun mymessage()
}

class DelegateImpl : DelegateIntr {
    override val value: String = "Akshay"
    override fun mymessage() {
        TODO("Not yet implemented")
    }

}

fun main() {
    val ge = gasEngine()
    val c = Car(ge)
    c.start()
    c.end()
    val pair = Pair(1, 2)
    println("${pair.first} ${pair.second}")

}