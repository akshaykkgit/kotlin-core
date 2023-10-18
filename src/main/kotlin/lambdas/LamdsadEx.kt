package lambdas

import patterns.Logger

data class Student(val name:String,val age:Int)
fun main() {

    val listStudent= listOf(
        Student("Akshay",31),
        Student("Arun",32),
        Student("Deepak",30),
        Student("Anumitha",28),
        Student("Arjun",32)
    )
    val combos=listStudent.map { s-> s.name+"-"+s.age }
    println("Combos:$combos")
    println("Old Student:${listStudent.maxBy { it.age }}")
    val fil=listStudent.filter { s->s.age<30 }
    println("Below 30 :$fil")

    val filComStuds=listStudent.filter { s->s.age>30 }.map { s-> s.name+"-"+s.age }
    println("Filtered anc compos list :$filComStuds")
     val fc={
         println("DDONE")
    }
    passMeFunction { fc }



}
fun passMeFunction(abc: () -> Unit) {
    // I can take function
    // do something here
    // execute the function
    abc()
}