package polymorphism

fun main() {
    val c=CompilePolymor()
    println(c.add(2,4))
    println(c.add(5.0,6.0))
}
class CompilePolymor{

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

}