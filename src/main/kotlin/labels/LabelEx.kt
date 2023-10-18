package labels

fun main() {

    outterloop@ for (i in 1..3){
        innerloop@ for (j in 1..3){
            if(i==2 && j==2){
                break@innerloop
            }
            println(" CASE 1 :i=$i, j=$j")
        }

    }
    outterloop@ for (i in 1..3){
        innerloop@ for (j in 1..3){
            if(i==2 && j==2){
                continue@outterloop
            }
            println("CASE 2:i=$i, j=$j")
        }

    }
}