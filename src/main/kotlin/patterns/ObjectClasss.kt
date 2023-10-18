package patterns

object Test {

    init {
        println("Init 2")
    }

    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}

object  Test22 {

    val a:String=""
    val b:Int=0
    init {
        println("Initialized")
    }

}

fun main(args: Array<String>) {
    val result: Int
    val b=Test22

    val c=Test22

    result = Test.makeMe12()
    println("b = ${Test.b}")
    Test.b=2
    println("result = $result")
}