package interview

fun main() {
   println("Enter a Num:")
   val num= readLine()
   if (num!=null){
       if(isPalindromeNumber(num.toInt()))
           println("Palindrome")
       else
           println("Not Palindrome")
   }
   println("Enter a String :")
    val input= readLine()
    if (isStringPalindrome(input.toString())){
        println("Palindrome")
    }
    else{
        println("Not Palindrome")
    }

}
fun isStringPalindrome(input:String):Boolean{
    val rev=input.reversed()
    return input.equals(rev)
}
fun isPalindromeNumber(num:Int):Boolean{
    var n=num
    var rev=0
    while(n>0){
        val digit=n%10
        rev=(rev*10)+digit
        n /= 10
    }
    return rev==num
}