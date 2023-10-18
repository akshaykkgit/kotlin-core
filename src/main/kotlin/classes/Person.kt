package classes

import javax.naming.ldap.LdapName
@Deprecated("Use Person2 Instead", ReplaceWith("Person2"))
class Person {

}


//With COnstructor

class Person2 constructor(name: String, lName: String) {

    constructor(name: String, lName: String,mname:String):this(name, lName){

    }

}

class Person3 constructor(name: String, lName: String) {
    init {
        println("Full Name:$name $lName")
    }

    constructor(name: String, mname: String, lName: String) : this(name, lName) {

    }
}

fun main() {
    val p3 = Person3("Akshay", "KK")
    val p33=Person3("Akshay","a","b")
    val p2=Person2("ak","sh","kk")

    var location= object {
        var xpos=200
        var ypos=400
    }
    println("x=${location.xpos},y=${location.ypos}")

}
