package strOpr

fun main() {

    //Using String Interpolation:-
    val s1 = "Interview"
    val s2 = "Bit"
    val s3 = "$s1 $s2" // stores "Interview Bit"
    println(s3)

//Using the + or plus() operator:-
    val s4 = s1 + s2 // stores "InterviewBit"
    println(s4)
    val s5 = s1.plus(s2) // stores "InterviewBit"
    println(s5)


//Using StringBuilder:-
    val s6 =  StringBuilder()
    s6.append(s1).append(s2)
    val s7 = s6.toString() // stores "InterviewBit"
    println(s7)
}