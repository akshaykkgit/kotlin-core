package stringOpr



fun main() {
    //CONCATENATIONS
    val a="Hellow"
    val b="World"
    //1. Using String interpolation
    val c="$a $b"
    println(c)
    //2. Using Plus
    val d=a.plus(b)
    println(d)
    //3.Using String Builder
    val sb=StringBuilder()
    sb.append(a).append(b)
    val e=sb.toString()
    println(e)
    val formatted="word1=%s,word2=%s".format(a,b)
    println(formatted)


    //STRING EQUALITY
    val str1="Hellow"
    val str2="Hellow"
    val str3="hellow"
    val str4="   akshay  "
    val isequal= str1==str2
    val text ="Hellow World"
    println(isequal) //TRUE
    val isEqual2=str1.equals(str1)
    println(isEqual2) // TRUE
    val isEqual3=str1.equals(str3,ignoreCase = true)
    println(isEqual3) // TRUE
    val isEqual4=str1==="Hellow"
    println(isEqual4)

    //TRIMMING
    val trimmed=str4.trim()
    val trimLeft=str4.trimStart()
    val trimRight=str4.trimEnd()
    println("'$trimmed'")
    println("'$trimLeft'")
    println("'$trimRight'")

    //REPLACE
    val modified=text.replace("World","Kotlin")
    println(modified)










}