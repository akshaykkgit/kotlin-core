package collection

data class Products(val name: String, val price: Int)

data class Products2(val name: String, val price: Int) :Comparable<Products2>{
    override fun compareTo(other: Products2): Int {
        return this.name.compareTo(other.name)
    }
}

fun main() {
    val produts = listOf(
        Products("SOAP", 1),
        Products("Mirror", 3),
        Products("Docs", 2)
    )
    val comparator=Comparator<Products>{p1,p2 -> p1.name.compareTo(p2.name)}
    val sortedProduct= produts.sortedWith(comparator)

    val produts2 = listOf(
        Products2("SOAP", 1),
        Products2("Mirror", 3),
        Products2("Docs", 2)
    )

    println(sortedProduct)
    println(produts2.sorted())
}