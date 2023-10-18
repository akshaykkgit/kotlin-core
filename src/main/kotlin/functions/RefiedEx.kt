package functions
 inline fun <reified T> genericsExample(value: T) {
    println(value)
    println("Type of T: ${T::class.java}")
}
fun <T> genericsExample2(classType: Class<T>, value: T) {
    println(value)
    println("Type of T: ${classType}")
}
class Company<T>(t:T){
    var a=t
    init {
        println(a)
    }
}




fun main() {

    genericsExample<String>("Hellow")
    genericsExample<Int>(10)
    var name =Company<Int>(1)
    val addr=Company<String>("sss")

}

