package asynchronous.thread

import java.util.concurrent.Executors

class CustomThread:Thread("CUSTOM-THREAD"){
    override fun run() {
        super.run()
        println(Thread.currentThread().name)
        println("Custom Thread run()")
    }
}

class CustomRunnable : Runnable{
    override fun run() {
        println(Thread.currentThread().name)
        println("CustomRunnable.run()")
    }

}
val exec=Executors.newSingleThreadExecutor()
val multiThreadExec=Executors.newFixedThreadPool(3)
fun main() {
    val rnable=Thread(CustomRunnable())
    rnable.start()
    
//   println(Thread.currentThread().name)
//   CustomThread().start()
//
//   Thread(CustomThread()).start()

 //   exec.submit(CustomRunnable())
//    for (i in 0..10){
//        multiThreadExec.submit(CustomRunnable())
//    }
}