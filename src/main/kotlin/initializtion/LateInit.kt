package initializtion

class FastClass() {

    val slowObject by lazy {
        SlowClass()
    }
    init {
        println("Fast init")
    }
}
class SlowClass{
    init {
        println("Slow init")
    }
}

data class DestrEx(val name:String,val age:Int,val addr:String){


}

fun main() {
    val fc=FastClass()
    fc.slowObject

    val data=DestrEx("a",1,"addr1")
    val arr= arrayOf(1,2)
    //Convienient way of extracting data from object
    val (name, age) = data
    val (n1,n2) = arr
    println("$name - $age")
    println("$n1 - $n2")


    //used to declare non null property when that is not immediately initialized
    lateinit var test: String



    fun testFunction() {
        test = "Interview"
        println("The length of string is "+test.length)
        test = "Bit"
    }
    testFunction()
    val per=Person()
    per.checkInit()
    per.initializeName()
    per.checkInit()



}
class Person {
    lateinit var name: String
    fun initializeName() {
        name = "MindOrks" // initializing name
    }
    fun checkInit() {
        println(this::name.isInitialized)
    }
}
