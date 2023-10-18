package lambdas


class Loggr private constructor(){
    init {
        println("Initialized Logger")
    }
    fun log(message:String){
        println("Log :$message")
    }
    companion object{
        var instance:Loggr?=null

        fun getInstanceone():Loggr{
            if(instance==null){
                instance= Loggr()
            }
            return instance!!
        }

    }
}

fun main() {
    val logger1=Loggr.getInstanceone()
    val logger2=Loggr.getInstanceone()
    logger1.log("test log")
}