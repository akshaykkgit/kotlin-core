package generics
abstract class Car{

}
class Audi :Car(){

}
class Benz: Car(){

}
class CarMechanic<out obj:Car> {  //out used to support Subclass Support
    fun repair(){}
}
class WorkShop{
    fun addMechnic(mechanic:CarMechanic<Car>){

    }
}

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

fun main() {
/*    we need to use the 'out' keyword on the generic type. It means that we
      can assign this reference to any of its supertypes.
      The out value can be only be produced by the given class but not consumed:

      I call it production class/interface, as it is mainly to produce output of the generic type.

      */
    val carMech=CarMechanic<Audi>() //compile error w/o out
    val workShop=WorkShop()
    workShop.addMechnic(carMech)

    val parameterizedProducer = ParameterizedProducer("string")
    val ref: ParameterizedProducer<Any> = parameterizedProducer
    println( ref.get())
    println(ref is ParameterizedProducer<Any>)
}
