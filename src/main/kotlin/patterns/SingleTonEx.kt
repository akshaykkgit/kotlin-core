package patterns


fun main() {
    val logger=Logger.getInstance()
    val logger2=Logger.getInstance()
    logger.log("test log 1")
    logger2.log("test log 2")

}
class Logger private constructor(){
    init {
        println("Logger initialized.")
    }
    fun log(message:String){
        println("Log :$message")
    }
    companion object {
        private var instance:Logger?= null

        fun getInstance():Logger{
            if (instance==null){
                instance= Logger()
            }
            return instance!!
        }
    }
}