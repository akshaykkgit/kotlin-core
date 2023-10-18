package patterns



class ThreadSafeSingleton private constructor() {

    init {
        println("Init 1")
    }

    companion object {

        // This is the instance that will be shared among all threads

        @Volatile

        private var instance: ThreadSafeSingleton? = null



        fun getInstance(): ThreadSafeSingleton {

            // Check if the instance has been initialized

            if (instance == null) {

                // Use synchronized block to ensure thread safety

                synchronized(this) {

                    // Double-check to avoid race conditions

                    if (instance == null) {

                        instance = ThreadSafeSingleton()

                    }

                }

            }

            return instance!!

        }

    }



    fun doSomething() {

        println("Singleton is doing something.")

    }

}
fun main() {
    val a=ThreadSafeSingleton.getInstance()
    val b= ThreadSafeSingleton.getInstance()
}