package asynchronous.coroutines

import kotlinx.coroutines.*


fun main(): Unit = runBlocking {
    //Here UpdateUI will execute first
    //this is just demo for Coroutine can work non-sequential as well
    // This Example using Context that will run task in diffrent thread
    //Here we need to complete refreshTask() and refreshReservation() before updateUI()
    //This will lauch below 2 task in worker thread
    val task1= async { refreshTask() } // create a new coroutine
    val task2=async { refreshReservation() }// create new coroutine
    awaitAll(task1,task2) // waiti till both the task are finsihed. both task run serially
    withContext(this@runBlocking.coroutineContext) { //This will call back to the delegation.main Thread
        updateUI()
    }
    val job=launch { refreshUser() }
    cancelEverything(job)// will cancel all the task inside launch



    val job2 = CoroutineScope(Dispatchers.Default).launch {

        // Coroutine code here

    }




}

private suspend fun refreshTask() {
    delay(2000)
    println("Resfresh Task on ${Thread.currentThread().name}")
}

private suspend fun refreshReservation() {
    delay(2000)
    println("Resfreshing Reservation on ${Thread.currentThread().name}")
}

private fun updateUI() {
    println("Updating UI on ${Thread.currentThread().name}")
}
private fun refreshUser() {
    println("User Refresh ${Thread.currentThread().name}")
}
private fun cancelEverything(vararg jobs:Job){
    jobs.forEach { it.cancel() }
}


/*fun delegation.main(): Unit = runBlocking {
    //Here UpdateUI will execute first
    //this is just demo for Coroutine can work non-sequential as well
    // This Example using Context that will run task in diffrent thread
    //Here we need to complete refreshTask() and refreshReservation() before updateUI()
    //This will lauch below 2 task in worker thread
    val task1= async { refreshTask() } // create a new coroutine
    val task2=async { refreshReservation() }// create new coroutine
    awaitAll(task1,task2) // waiti till both the task are finsihed. both task run serially
    withContext(this@runBlocking.coroutineContext) { //This will call back to the delegation.main Thread
        updateUI()
    }
    val job=launch { refreshUser() }
    job.cancel() // will cancel all the task inside launch




}

private suspend fun refreshTask() {
    delay(2000)
    println("Resfresh Task on ${Thread.currentThread().name}")
}

private suspend fun refreshReservation() {
    delay(2000)
    println("Resfreshing Reservation on ${Thread.currentThread().name}")
}

private fun updateUI() {
    println("Updating UI on ${Thread.currentThread().name}")
}
 private fun refreshUser() {
     println("User Refresh ${Thread.currentThread().name}")
 }
*/
////////////////////////////////////////////////////////////////
/*fun delegation.main():Unit= runBlocking {
    //Here UpdateUI will execute first
    //this is just demo for Coroutine can work non-sequential as well
    // This Example using Context that will run task in diffrent thread
    //Here we need to complete refreshTask() and refreshReservation() before updateUI()
    launch(Dispatchers.IO) {//This will lauch below 2 task in worker thread
        refreshTask()
        refreshReservation()
        withContext(this@runBlocking.coroutineContext){ //This will call back to the delegation.main Thread
            updateUI()
        }
        println("Test")
    }

}
private fun refreshTask(){
    println("Resfresh Task on ${Thread.currentThread().name}")
}
private fun refreshReservation(){
    println("Resfreshing Reservation on ${Thread.currentThread().name}")
}
private fun updateUI(){
    println("Updating UI on ${Thread.currentThread().name}")
}*/


////////////////////////////////////////////////////////////////////////

/*
fun delegation.main():Unit= runBlocking {
    //Here UpdateUI will execute first
    //this is just demo for Coroutine can work non-sequential as well
    launch(Dispatchers.IO) {//This will lauch below 2 task in worker thread
        refreshTask()
        refreshReservation()
    }
    updateUI()
}
private fun refreshTask(){
    println("Resfresh Task on ${Thread.currentThread().name}")
}
private fun refreshReservation(){
    println("Resfreshing Reservation on ${Thread.currentThread().name}")
}
private fun updateUI(){
    println("Updating UI on ${Thread.currentThread().name}")
}
*/


//////////////////////////////////////////////

/*fun delegation.main():Unit= runBlocking {
    //Here UpdateUI will execute first
    //This is still working on the upderlying thread
    //this is just demo for Coroutine can work non-sequential as well
    launch {
        refreshTask()
        refreshReservation()
    }
    updateUI()
}
private fun refreshTask(){
    println("Resfresh Task on ${Thread.currentThread().name}")
}
private fun refreshReservation(){
    println("Resfreshing Reservation on ${Thread.currentThread().name}")
}
private fun updateUI(){
    println("Updating UI on ${Thread.currentThread().name}")
}*/


/////////////////////////////////////////////////////////////////////

/*
fun delegation.main():Unit= runBlocking {
    //within the coroutine code will execute  sequentially by default
    refreshTask()
    refreshReservation()
    updateUI()
}
private fun refreshTask(){
    println("Resfresh Task on ${Thread.currentThread().name}")
}
private fun refreshReservation(){
    println("Resfreshing Reservation on ${Thread.currentThread().name}")
}
private fun updateUI(){
    println("Updating UI on ${Thread.currentThread().name}")
}
*/
