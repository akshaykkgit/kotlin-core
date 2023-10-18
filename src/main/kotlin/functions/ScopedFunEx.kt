package functions

fun main() {
   // performApplyOperation()
    //performLetOperation()
  // performAlsoOperation()
//    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")
//    numbers.map { it.length }.filter { it > 3 }.let {
//        print(it)
//    }
//    val person = Personss().let {
//        return@let "\nThe name of the Person is: ${it.name}"
//    }
    //performWithOperation()
   performRunOperation()

}
private fun performLetOperation() {
 /*   This implies that the “ let” operator provides an
     to perform an operation on the current object and
     return any value based on the use case.*/
    val person2 = Personss().let { personDetails ->
        personDetails.name = "NewName"
        personDetails

    }
    println(person2.displayInfo())
}
/*    “ let ” can also be used when we want to perform an operation
    on the result of a call chain. Let’s take the following example:*/




class Personss() {
    var name: String = "Abcd"
    var contactNumber: String = "1234567890"
    var address: String = "xyz"
    fun displayInfo()  = print("\n Name: $name\n " +
            "Contact Number: $contactNumber\n " +
            "Address: $address")

}
private fun performWithOperation() {
    val person= Personss()
    val a= with(person) {
        name = "asdf"
        contactNumber = "1234"
        address = "wasd"
        displayInfo()
        this
    }

    println(a.displayInfo())

}
private fun performAlsoOperation() {
    val person= Personss()
    val a=person.also { person->
        person.name = "also"
        person.address = "alsoooo"

    }
    println(a.displayInfo())
}
private fun performRunOperation() {
    val person=Personss()
    val b=person.run {
        name = "asdf"
        contactNumber = "1234"
        address = "wasd"
        displayInfo()
        //"this"

    }
    println(b)
}
private fun performApplyOperation() {
    val person= Personss()
    val b=person.apply {
        this?.name = "asdf"
        this?.contactNumber = "1234"
        this?.address = "wasd"
"dd"

    }
    println(b.displayInfo())
}