package functions

 inline fun executeAll(action1: () -> Unit,noinline action2: () -> Unit) {
    action1()
    action2()
}
fun main() {
    executeAll({ print("Hello")}, { print(" World") })
   /* this is equalet to below code
    print("Hello")
    val action2 = { print(" World") }
    action2()
    */

    //Cross line issue
    executeAll({
        print("Hello")
        return
     /*   this will exit from the entire function executeAll
        this kind of return called  non-local returns.*/
               }
        , { print(" World") })

}

