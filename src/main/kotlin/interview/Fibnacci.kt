package interview

fun fibnacci(n:Int):Int{
    if (n>=2){
        return fibnacci(n-1)+ fibnacci(n-2)
    }
    else{
        return n
    }
}
fun fibnormal(n:Long){
        var curr=0
        var next=1
        for (i in 0 until n) {
            if (n > 0) {
                print("  $curr")
                val r = curr + next
                curr = next
                next = r
            }

        }
    }
fun main() {
    val n=1L
    println("Fibnacci :")
    for( i in 0 until n){
        print("${fibnacci(i.toInt())}   ")
    }
    println()
    fibnormal(n)
}

/*
fun main() {
    val n=2
    var curr=0
    var next=1
    for (i in 0 until n) {
        if (n > 0) {
            print("  $curr")
            val r = curr + next
            curr = next
            next = r
        }

    }
}*/
