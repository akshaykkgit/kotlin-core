package classes

interface InterfaceEx {
    val name:String

     fun go(){
         println("starting")
     }
    fun stop(){
        println("stoping")
    }
    fun getNum():Int{
        return 5
    }
    fun implFun():Int
}


class IntefaceImpl :InterfaceEx{
    override val name: String
        get() = "Example"

    override fun implFun(): Int {
        return 4
    }

}
interface Vehicle{


    val wheels:Int
    fun getWheels():String
    fun sound():String{
        return "boom"
    }
}
class Car: Vehicle{
    override val wheels: Int
        get() = 4

    override fun getWheels(): String {
        return "4 Wheels"
    }


}


fun main() {
    val ex=IntefaceImpl()
    println(ex.name)
    println(ex.getNum())
    val car=Car()
    println(car.wheels)
    println(car.getWheels())
   //val i= InterfaceEx()
}