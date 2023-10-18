package generics

fun main() {
 /*   We can use the 'in' keyword on the generic type if we want to assign it to the reference
            of its subtype. The in keyword can be used only on the parameter type that is
    consumed, not produced:*/
    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val ref: ParameterizedConsumer<Double> = parameterizedConsumer
    println(ref is ParameterizedConsumer<Double>)

//I call it production class/interface, as it is mainly to produce
// output of the generic type.


    // Create a Box that accepts Number (superclass of Int)
    val numberBox: Box<Number> = Box(10)
    // Assign a new Integer value (subclass of Number)
    numberBox.setValue(20)
    // Attempting to assign a Double value (subclass of Number) would work as well
    val doubleBox: Box<Number> = Box(3.14)
    doubleBox.setValue(2.71)
    // This is not allowed because 'Box<Number>' is a supertype of 'Box<Int>'
    // val intBox: Box<Int> = numberBox // Error: Type mismatch
    // However, you can use the 'Box<Number>' reference to set an Integer value
    (numberBox as Box<Int>).setValue(30)


}
class ParameterizedConsumer<in T> {

    fun toString(value: T): String {
        return value.toString()
    }
}
interface  Compr<in T>{
    fun compareTothe(othet:T):Int
}
fun doSomething(comparable:Compr<Number>){
 val x:Compr<Int> =comparable
}


class Box<in T>(private var v:T){
    fun setValue(value:T){
        v=value
    }
    fun getValue():String{
        return v.toString()
    }
}




