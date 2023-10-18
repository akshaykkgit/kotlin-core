package annotation

fun main() {

}
public class MyClass(){
    @JvmField
    var myField:Int=32
    var field2:Int=0

    companion object{
        @JvmStatic
        fun staticMethod():String{
            return "Hellow"
        }
    }
}
/*
Java dont support default constructor
As we know that Java does not support default parameters. It supports overloading.

And, Kotlin supports default parameters.

So, we will have to use @JvmOverloads. It instructs the Kotlin compiler to generate overloads for the function or constructor that substitute default parameter values.
*/
data class Myclass2 @JvmOverloads constructor(val name:String,val age:Int=32){

}