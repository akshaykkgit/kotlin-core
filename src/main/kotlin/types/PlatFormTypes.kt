package types

import com.akshay.java.TestPaltform
import kotlin.reflect.typeOf

fun main() {
     //platform types are types of Java declaration.
     // Objects in the Java language are nullable. Therefore,
     // Kotlin can’t check their nullability at compile-time in Kotlin.
     val tp= TestPaltform()
     println(tp.value.length)//Nullability check broken

}