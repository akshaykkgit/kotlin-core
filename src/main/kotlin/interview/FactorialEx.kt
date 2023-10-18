package interview
fun factorial(num:Int):Int{

    if(num<=1){
        return 1
    }
    else {
        var fact= num* factorial(num-1)
        return fact
    }
}
fun factorialNormal(num:Int):Int{
    var fact=1
    for (i in 1..num){
        fact*=i
    }
    return fact

}
fun main() {
    val num=5
    val result= factorial(num)
    println("Result 1=$result")
    val resultNormal= factorialNormal(num)
    println("Result 2=$resultNormal")

}
