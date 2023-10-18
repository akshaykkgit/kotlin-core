package functions

fun foo() {
    val fun1 = {
        println("Hello")
   //     return // won't compile
    }
}

/*
Here, the Kotlin compiler won’t allow us to exit from the
enclosing function using a return inside the lambda.
Such returns are called non-local returns.*/

inline fun foo2(f: () -> Unit) {
   // bar { f() } //wont compile
}

fun bar(f: () -> Unit) {
    f()
}
/*
uncomment
Here, we’re passing the f lambda from an inline function to
a non-inline function. When the lambda parameter in an inline
function is passed to another non-inline function
context like this, we can’t use non-local returns.
So,the above code won’t even compile in Kotlin*/

inline fun foo3(crossinline f: () -> Unit) {
    bar3 { f()
    }
}

fun bar3(f: () -> Unit) {
    f()
}
/*Sometimes, we know that we’re not going
to use non-local control flows in lambda functions.
At the same time, we may also want to benefit from the
advantages of inline functions.

In such situations, we can mark the inline function
lambda parameter with the crossinline modifier:

With the help of the crossinline modifier,
the above code will compile. However,
we still can’t use non-local returns on the call site: */

fun main() {
    foo3 {  }
}
