package nullablity

fun main() {

    //Non Nullable Type
    val name: String = "Akshay"

    //Nullbale declaration
    var name2: String? = null

    val name3: String? = null

    // safe call operator ?.
    val len = name3?.length
    println("len=$len")


//•	Elvis Operator (?:): It provides a default value to be used if the expression on the left is null.
    val len2 = name3?.length ?: 0
    println("len=$len2")

    //
    //name2="a"
    //execute the block when not eq null
    name2?.let {
        println("length=${name2.length}")
    }




}
