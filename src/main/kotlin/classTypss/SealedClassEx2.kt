package classTypss

fun main() {

}
sealed class A2{
    class B : A2()
    {
        class E : A2() //this works.
    }
    class C : A2()

    init {
        println("sealed class A")
    }

}

class D : A2() //this works
{
    class F: A2() //This won't work. Since sealed class is defined in another scope.
}